package cn.kern.elementexcel.api.constants;

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

    XLS( ".xls", "D0CF11E0", "The 1997 to 2003 edition."),
    XLSX(".xlsx", "504B0304", "The edition since 2003."),
    ;

    private final String suffix;
    private final String headerHex;
    private final String description;

    DocumentType(String suffix, String headerHex, String description) {
        this.suffix = suffix;
        this.headerHex = headerHex;
        this.description = description;
    }
}
