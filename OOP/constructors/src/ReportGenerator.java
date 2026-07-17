public class ReportGenerator {

    private String excelFilePath;
    private String outputFormat;

    public String getExcelFilePath() {
        return excelFilePath;
    }

    public void setExcelFilePath(String excelFilePath) {
        this.excelFilePath = excelFilePath;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public ReportGenerator(String excelFilePath){
        this(excelFilePath,"PDF");


    }

    public ReportGenerator(String excelFilePath, String outputFormat) {
        if (excelFilePath == null || excelFilePath.isEmpty()) {
            throw new IllegalArgumentException("Excel dosyası belirtilmeli");
        }
        this.excelFilePath = excelFilePath;
        this.outputFormat = outputFormat;
    }
}
