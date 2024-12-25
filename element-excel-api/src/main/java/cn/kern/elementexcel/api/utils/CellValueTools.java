package cn.kern.elementexcel.api.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.ExcelNumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @uthor Kern
 * @version 1.0
 */
public final class CellValueTools {

    public static void setCellObjectValue(Cell cell, Object value) {
        if (value == null) {
            return;
        }
        Class<?> type = value.getClass();
        //Number
        if (DataTypeGroupTools.isMemberOfIntType(type)){
            cell.setCellValue(((Integer)value));
        } else if (DataTypeGroupTools.isMemberOfDecimal(type)){
            cell.setCellValue(((Number)value).doubleValue());
        }
        //Date
        else if (DataTypeGroupTools.isMemberOfDateType(type)) {
            cell.setCellValue((Date)value);
        }
        //LocalDate
        else if (value instanceof LocalDate) {
            cell.setCellValue((Date.from(((LocalDate) value).atStartOfDay(ZoneId.systemDefault()).toInstant())));
        }
        //LocalDateTime
        else if (value instanceof LocalDateTime) {
            cell.setCellValue((LocalDateTime)value);
        }
        //Boolean
        else if (value instanceof Boolean) {
            cell.setCellValue((Boolean)value);
        }
        //Other cases
        else {
            cell.setCellValue(value.toString());
        }
    }

    public static <T> T getCellValueBySpecifiedType(Cell cell, Class<T> targetClass) {
        Object ret = null;
        //String
        if (cell.getCellType() == CellType.STRING && String.class.isAssignableFrom(targetClass)) {
            String str = cell.getStringCellValue().trim();
            ret = "".equals(str) ? null : str;
        }
        //Date
        else if (isCellDateFormat(cell)) {
            if (LocalDate.class.isAssignableFrom(targetClass)){
                ret = cell.getLocalDateTimeCellValue().toLocalDate();
            } else if (LocalDateTime.class == targetClass) {
                ret = cell.getLocalDateTimeCellValue();
            } else if (Date.class.isAssignableFrom(targetClass)){
                ret = cell.getDateCellValue();
            }
        }
        //Double
        else if (cell.getCellType() == CellType.NUMERIC){
            Double aDouble = cell.getNumericCellValue();
            //decimal
            if (BigDecimal.class.isAssignableFrom(targetClass)){
                ret = BigDecimal.valueOf(aDouble);
            } else if (Float.class.isAssignableFrom(targetClass)) {
                ret = aDouble.floatValue();
            } else if (Double.class.isAssignableFrom(targetClass)) {
                ret = aDouble;
             //int
            } else if (Long.class.isAssignableFrom(targetClass)) {
                ret = aDouble.longValue();
            } else if (Integer.class.isAssignableFrom(targetClass)){
                //自动装拆包
                ret = aDouble.intValue();
            //String
            } else if (String.class.isAssignableFrom(targetClass)){
                ret = aDouble.intValue() + "";
            }
        }
        //Boolean
        else if (cell.getCellType() == CellType.BOOLEAN && Boolean.class.isAssignableFrom(targetClass)) {
            ret = cell.getBooleanCellValue();
        } else {
            return null;
        }
        //In other cases , ret == null
        return (T) ret;
    }

    public static Object getCellValue(Cell cell) {
        //String
        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue().trim();
        }
        //Date
        else if (isCellDateFormat(cell)) {
            return cell.getDateCellValue();
        }
        //Double
        else if (cell.getCellType() == CellType.NUMERIC){
            return cell.getNumericCellValue();
        }
        //Boolean
        else if (cell.getCellType() == CellType.BOOLEAN) {
            return cell.getBooleanCellValue();
        }
        return "";
    }

    private static boolean isCellDateFormat(Cell cell) {
        if (cell == null) {
            return false;
        } else {
            boolean bDate = false;
            if (cell.getCellType() == CellType.NUMERIC) {
                double d = cell.getNumericCellValue();
                if (DateUtil.isValidExcelDate(d)) {
                    ExcelNumberFormat nf = ExcelNumberFormat.from(cell, null);
                    if (nf == null) {
                        return false;
                    }

                    bDate = DateUtil.isADateFormat(nf);
                }
            }
            return bDate;
        }
    }
}
