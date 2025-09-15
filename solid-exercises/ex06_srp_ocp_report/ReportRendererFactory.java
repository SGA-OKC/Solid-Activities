class ReportRendererFactory {
    
    public static ReportRenderer getRenderer(String format) {
        switch (format) {
            case "PDF":
                return new PDFReportRenderer();
            case "CSV":
                return new CSVReportRenderer();
            case "XLS":
                return new XLSReportRenderer();
            default:
                throw new IllegalArgumentException("Formato Invalido: " + format);
        }
    }
}