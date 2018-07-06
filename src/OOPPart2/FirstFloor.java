package OOPPart2;

public class FirstFloor extends Floor {
    private TV tv;

    public FirstFloor(int doors, int windows, TV tv) {
        super(doors, windows);
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
