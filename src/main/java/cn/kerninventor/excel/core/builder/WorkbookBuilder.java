package cn.kerninventor.excel.core.builder;

import cn.kerninventor.excel.core.utils.Assert;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.validation.constraints.Null;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 *     构造器
 * </p>
 *
 * @Since: 2021/3/30
 * @author: Kern
 */
public class WorkbookBuilder {

    public Workbook construct(String localFilePath) throws IOException {
        File localFile = new File(localFilePath);
        Assert.isTrue(localFile.exists(), new NullPointerException("文件不存在"));
        Assert.isTrue(localFile.isFile(), "文件格式错误!");
        return construct(localFile);
    }

    public static Workbook construct(File file) throws IOException {
        return construct(new FileInputStream(file));
    }

    public static Workbook construct(InputStream inputStream) throws IOException {
        return WorkbookFactory.create(inputStream);
    }

}
