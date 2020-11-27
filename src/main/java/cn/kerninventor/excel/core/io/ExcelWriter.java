package cn.kerninventor.excel.core.io;

import cn.kerninventor.excel.core.Appender;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class ExcelWriter<T> implements Writer<T> {


    @Override
    public Writer<T> overwrite(boolean overwrite) {
        return null;
    }

    @Override
    public Reader<T> convert() {
        return null;
    }

    @Override
    public WriteBreakpoint breakOff() {
        return null;
    }

    @Override
    public WriteBreakpoint output(Appender... appenderArr) {
        return null;
    }


    public ExcelWriter<T> write() {

        //写入器的基本步骤

        /**
         * 1. 获取配置信息
         * 2. 书写合并区域(包括表体，备注栏， 信息栏等)
         * 3. 书写悬浮物(文本框，图片)
         * 4. 书写表头
         * 5. 书写表体(约束书写，风格书写)
         */

        /**
         * 写入器全局
         *
         * 维护书写的行指针 和 列指针
         *
         * 通用的步骤
         *
         * 风格、字体的设置
         *
         *
         */



        return this;
    }
}
