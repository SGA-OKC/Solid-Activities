class XLSReportRenderer implements ReportRenderer {
   
    @Override
    public byte[] render(ReportData data) {
        return ("[XLS] " + data.title + "\n" + String.join("\n", data.lines)).getBytes();
    }
}