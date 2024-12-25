package cn.kern.elementexcel.api.user.interfaces;


import cn.kern.elementexcel.api.io.component.Component;
import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *     单元格值写入器
 * </p>
 *
 * @author Kern
 */
public interface CellValueWriter extends Component {

    /**
     * 是否是支持的泛型
     * @param fieldClass
     */
    void isSupportedType(Class<?> fieldClass);

    /**
     * 设置单元格值
     * @param cell
     * @param value
     */
    void setCellValue(Cell cell, Object value);

}
