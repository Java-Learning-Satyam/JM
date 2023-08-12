public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    protected int addToner(int tonerAmount) {
       int tempAmount = tonerAmount + tonerLevel;
       if (tempAmount > 100 || tempAmount < 0) {
           return -1;
       }
       tonerLevel += tonerAmount;
//        System.out.println("Toner level - > " + tonerLevel);
        return tonerLevel;
    }

    protected int printPages(int pages) {
        int pagesToPrint = pages;
        pagesToPrint = (duplex) ? (pages  / 2) + (pages % 2) : pages;
        if (duplex){
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;
//        System.out.println("Printed Pages - > " + pagesPrinted);
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
