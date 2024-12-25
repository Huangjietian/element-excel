package cn.kern.elementexcel.api.io;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Iterator;

/**
 * <p>TODO</p>
 *
 * @author kern
 */
public class SheetCleaner {

    public static void remove(Sheet preRemoveSheet) {
        if (preRemoveSheet == null) {
            return;
        }
        Workbook workbook = preRemoveSheet.getWorkbook();
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        int incrementIdx = 0;
        while (sheetIterator.hasNext()) {
            Sheet nextSheet = sheetIterator.next();
            if (nextSheet.equals(preRemoveSheet)) {
                workbook.removeSheetAt(incrementIdx);
                break;
            }
            incrementIdx ++ ;
        }
    }

    public static Sheet cleanUp(Sheet preCleanSheet) {
        if (preCleanSheet == null) {
            return null;
        }
        Workbook workbook = preCleanSheet.getWorkbook();
        remove(preCleanSheet);
        return workbook.createSheet(preCleanSheet.getSheetName());
    }
}
