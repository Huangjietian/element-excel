package cn.kern.elementexcel.api;

import cn.kern.elementexcel.api.constants.DocumentType;
import cn.kern.elementexcel.api.utils.Assert;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

    public static Workbook build(DocumentType documentType) {
        if (documentType == DocumentType.XLS) {
            return new HSSFWorkbook();
        } else {
            return new XSSFWorkbook();
        }
    }

    public static Workbook build(String localFilePath) throws IOException {
        File localFile = new File(localFilePath);
        Assert.isTrue(localFile.exists(), new NullPointerException("File does not exist!"));
        Assert.isTrue(localFile.isFile(), "Wrong file format!");
        return build(localFile);
    }

    public static Workbook build(File file) throws IOException {
        return build(new FileInputStream(file));
    }

    public static Workbook build(InputStream inputStream) throws IOException {
        return WorkbookFactory.create(inputStream);
    }

}
