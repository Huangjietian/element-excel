package cn.kerninventor.excel.core.io.component;

/**
 * @author kern
 */
public interface Context {

    /**
     * 获取配置属性
     * @param key 健
     * @return 值
     */
    String getProperty(String key);

    /**
     * 设置配置属性
     * @param key 健
     * @param value 值
     * @return Context
     */
    Context setProperty(String key, String value);
}
