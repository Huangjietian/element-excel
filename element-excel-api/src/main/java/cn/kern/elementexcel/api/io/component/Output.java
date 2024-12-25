package cn.kern.elementexcel.api.io.component;

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
public interface Output {

    void output(Workbook workbook);


    /**
     * 输出到
     * @param httpServletResponse
     * @return
     */
    static Output of(HttpServletResponse httpServletResponse) {

        return workbook -> {

        };
    }

    static Output of(String localFilePath) {
        //TODO 校验文件名是否具有正常的后缀
        File file = new File(localFilePath);
        return workbook -> {

        };
    }

}
