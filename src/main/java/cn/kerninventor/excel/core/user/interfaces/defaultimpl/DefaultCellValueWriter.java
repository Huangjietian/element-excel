package cn.kerninventor.excel.core.user.interfaces.defaultimpl;

import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;
import cn.kerninventor.excel.core.utils.CellValueTools;
import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *     默认的列值写入器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueWriter implements CellValueWriter {

    @Override
    public void isSupportedType(Class<?> fieldClass) {
        //支持基础数据类型及其包装类型
        //此外还支持包括BigDecimal LocalDate LocalDateTime等常用数据类型
    }

    @Override
    public void setCellValue(Cell cell, Object value) {
        CellValueTools.setCellObjectValue(cell, value);
    }
}
