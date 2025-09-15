public class Main {

    public static void main(String[] args) {
        ReportData data = new ReportData();
        data.title = "Relatorio de Vendas";
        data.lines.add("Produto X, 100");
        data.lines.add("Produto Y, 250");

        ReportService service = new ReportService();

        System.out.println(new String(service.generate("PDF", data)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(new String(service.generate("CSV",data)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(new String(service.generate("XLS",data)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}