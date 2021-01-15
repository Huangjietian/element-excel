package cn.kerninventor.excel.core.user.interfaces;

import org.apache.poi.ss.usermodel.CellStyle;

/**
 * <p>
 *     风格订阅者
 * </p>
 *
 * @author Kern
 */
public interface CellStyleSubscriber {

    /**
     * 声明该订阅者将要订阅的风格hashKey
     * @return
     */
    String hashKey();

    /**
     * 用于接收订阅的风格
     * @param cellStyle
     */
    void take(CellStyle cellStyle);
}
