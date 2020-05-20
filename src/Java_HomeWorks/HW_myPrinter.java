package Java_HomeWorks;

public class HW_myPrinter {
    public static void main(String[] args) {
        int maxToner = 100;
        int maxPages = 100;
        int toner=10;
        int pages=58;
        int numSin=4;
        int numDou=23;
        int summary;


        HW_printerTemplate printer1 = new HW_printerTemplate();
        printer1.AddPages();

        printer1.AddToner();

        printer1.checkToner();

        printer1.printSinglePages();

        printer1.printDoublePages();

        printer1.PrinterSummary();
    }
}