package cn.kern.elementexcel.api.io;

import cn.kern.elementexcel.api.io.component.Output;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class DefaultElementExcelWriter<T> implements ElementExcelWriter<T> {

    private boolean isOverwrite = true;

    @Override
    public ElementExcelWriter<T> overwrite(boolean isOverwrite) {
        this.isOverwrite = isOverwrite;
        return this;
    }

    @Override
    public ElementExcelReader<T> convert() {
        return null;
    }

    @Override
    public WriteBreakpoint breakOff() {
        return null;
    }

    @Override
    public WriteBreakpoint output(Output... outputArr) {
        return null;
    }


    public DefaultElementExcelWriter<T> write() {

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
