package OOPPart2;

public class Printer {
    private int tonerLevel;
    private int numberPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberPages = numberPages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(){
        this.tonerLevel = 100;
    }

    public void validatePrinting(int ink){
        if (this.tonerLevel - ink > 0 && numberPages >= ink){
            this.tonerLevel-= ink;
            this.numberPages -= ink;
            System.out.println("Printed!");
        } else {
            System.out.println("Not enough ink or pages");
        }
    }

    public void printPages(int pages){
        int ink = 0;
        if (this.isDuplex){
            ink = pages / 2;
            ink = ink + pages % 2;
        } else {
            ink = pages;
        }
        validatePrinting(ink);
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
