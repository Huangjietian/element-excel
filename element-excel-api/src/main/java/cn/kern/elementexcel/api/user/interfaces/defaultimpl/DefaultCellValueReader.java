package cn.kern.elementexcel.api.user.interfaces.defaultimpl;

import cn.kern.elementexcel.api.user.interfaces.CellValueReader;
import cn.kern.elementexcel.api.utils.CellValueTools;
import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *     默认的单元格值读取器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueReader implements CellValueReader {

    @Override
    public void isSupportedType(Class<?> fieldClass) {
        //支持基础数据类型及其包装类型
        //此外还支持包括BigDecimal LocalDate LocalDateTime等常用数据类型
    }

    @Override
    public <T> T readCellValue(Cell cell, Class<T> generics) {
        return (T) CellValueTools.getCellValueBySpecifiedType(cell, generics);
    }

}
