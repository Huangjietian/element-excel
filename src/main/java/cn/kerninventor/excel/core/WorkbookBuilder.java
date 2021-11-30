package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.utils.Assert;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 *     构造器
 * </p>
 *
 * @author kern
 */
public class WorkbookBuilder {

    public Workbook construct(String localFilePath) throws IOException {
        File localFile = new File(localFilePath);
        Assert.isTrue(localFile.exists(), new NullPointerException("File does not exist"));
        Assert.isTrue(localFile.isFile(), "Wrong file format!");
        return construct(localFile);
    }

    public static Workbook construct(File file) throws IOException {
        return construct(new FileInputStream(file));
    }

    public static Workbook construct(InputStream inputStream) throws IOException {
        return WorkbookFactory.create(inputStream);
    }

}
