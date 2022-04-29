package cn.kerninventor.excel.core.constants;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 *     Excel document type enums.
 * </p>
 *
 * @author Kern
 */
@ToString
@Getter
public enum  DocumentType {

    XLS( ".xls", "The 1997 to 2003 edition."),
    XLSX(".xlsx", "The edition since 2003."),
    ;

    private final String suffix;
    private final String description;

    DocumentType(String suffix, String description) {
        this.suffix = suffix;
        this.description = description;
    }
}
