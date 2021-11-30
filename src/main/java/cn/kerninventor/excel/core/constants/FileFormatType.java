package cn.kerninventor.excel.core.constants;

/**
 * @author Kern
 * @version 1.0
 */
public enum FileFormatType {

    XLS_EXCEL("D0CF11E0", ".xls"),
    XLSX_EXCEL("504B0304", ".xlsx"),
    ;

    private String header;
    private String suffix;

    FileFormatType(String header, String suffix) {
        this.header = header;
        this.suffix = suffix;
    }

    public String getHeader() {
        return header;
    }

    public String getSuffix() {
        return suffix;
    }

    public static FileFormatType getFormatByHeader(String header){
        FileFormatType[] enums = FileFormatType.values();
        for (FileFormatType formatEnum : enums){
            if (header.contains(formatEnum.header)){
                return formatEnum;
            }
        }
        return null;
    }

    public static boolean isCorrectSuffix(String path, FileFormatType... fileFormatTypes) {
        if (path == null || "".equals(path.trim()) || !path.contains(".")){
            return false;
        }
        boolean isCorrect = false;
        for (FileFormatType fileFormatType : fileFormatTypes){
            if (path.substring(path.lastIndexOf(".")).equals(fileFormatType.suffix)){
                isCorrect = true;
            }
        }
        return isCorrect;
    }
}
