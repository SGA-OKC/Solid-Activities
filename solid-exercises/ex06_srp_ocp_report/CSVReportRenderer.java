class CSVReportRenderer implements ReportRenderer {
   
    @Override
    public byte[] render(ReportData data) {
        return ("[CSV] " + data.title + "\n" + String.join("\n", data.lines)).getBytes();
    }
}