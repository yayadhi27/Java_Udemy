package Challenge_Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
    }

    public void addToner(int tonerAmount){
        if(tonerLevel + tonerAmount > 100) {
            System.out.println("Toner is full");
        }
        else{
            tonerLevel += tonerAmount;
            System.out.println("Toner Level is "+ tonerLevel);
        }

    }

    public void printPages(int pages){
        if(duplex == true){
            this.pagesPrinted =pages/2;
            System.out.println("No of pages to print(Duplex Printer) " + pagesPrinted );
        }else{
            this.pagesPrinted = pages;
            System.out.println("No of pages to print(Non-Duplex Printer) " + pagesPrinted);
        }

    }

    @Override
    public String toString() {
        return "Printer{" +
                "duplex=" + duplex +
                ", tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                '}';
    }
}
