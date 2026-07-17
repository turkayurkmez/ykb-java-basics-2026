public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator("C:\\proces.xslx");
        System.out.println(generator.getOutputFormat());

    }
}