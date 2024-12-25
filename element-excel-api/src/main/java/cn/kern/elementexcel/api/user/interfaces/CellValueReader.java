package cn.kern.elementexcel.api.user.interfaces;


import cn.kern.elementexcel.api.io.component.Component;
import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *     单元格值读取器
 * </p>
 *
 * @author Kern
 */
public interface CellValueReader extends Component {

    /**
     * 是否是支持的泛型
     * @param fieldClass
     */
    void isSupportedType(Class<?> fieldClass);

    /**
     * 读取单元格值
     * @param cell
     * @param generics
     * @param <T>
     * @return
     */
    <T> T readCellValue(Cell cell, Class<T> generics);

}
