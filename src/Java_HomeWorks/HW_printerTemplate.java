package Java_HomeWorks;

public class HW_printerTemplate {
    int maxToner = 100;
    int maxPages = 100;
    int toner;
    int pages;
    int numSin;
    int numDou;
    static int sinPage;
    static int douPage;

    public void AddToner() {
        toner = 0;
        while(toner<=100){
            System.out.println("You can add toner");
          toner++;
        }
    }


    public void AddPages() {
        pages = 0;
        while (pages <= 100) {
         System.out.println("You can add pages");
          pages++;
        }
    }

    public void checkToner() {
       toner = 0;
       while (toner < 10) {
       System.out.println("ADD TONER");
       toner--;
        }
    }

    public void printSinglePages() {
        for (int i = 1; i <= 100; i++) {
            int toner = maxToner - numSin;
            int pages = maxPages - numSin;
            System.out.println("single page printing - "+toner+ "toner left");
            System.out.println("single page printing - "+ pages+ "pages left");
        }
    }
    public void printDoublePages() {
        for (int i = 1; i <= 100; i++) {
            int toner = maxToner - 2*numDou;
            int pages = maxPages - numDou;
            System.out.println("double page printing - "+toner+ "toner left");
            System.out.println("double page printing - "+ pages+ "pages left");
        }
    }
    public void PrinterSummary(){
       for (int i=100; i>=0; i--){
           int summary =100;
           System.out.println(summary);
       }

    }







    }




