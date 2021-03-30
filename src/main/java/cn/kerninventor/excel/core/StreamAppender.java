package cn.kerninventor.excel.core;

import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * <p>
 *      输出
 * </p>
 *
 * @author Kern
 */
@FunctionalInterface
public interface StreamAppender {

    void output(Workbook workbook);


    /**
     * 输出到
     * @param httpServletResponse
     * @return
     */
    static StreamAppender of(HttpServletResponse httpServletResponse) {

        return workbook -> {

        };
    }

    static StreamAppender of(String localFilePath) {
        //TODO 校验文件名是否具有正常的后缀
        File file = new File(localFilePath);
        return workbook -> {

        };
    }

}
