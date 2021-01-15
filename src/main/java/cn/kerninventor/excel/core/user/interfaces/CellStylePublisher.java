package cn.kerninventor.excel.core.user.interfaces;


import org.apache.poi.ss.usermodel.CellStyle;

/**
 * <p>
 *     风格发布者
 * </p>
 *
 * @author Kern
 */
public interface CellStylePublisher {

    /**
     * 进行发布
     * @return
     */
    void publish(String hashKey, CellStyle cellStyle);

    /**
     * 接收订阅
     * @param subscriber
     */
    void receive(CellStyleSubscriber subscriber);

}
