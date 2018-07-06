package OOPPart2;

public class SecondFloor extends Floor{
    private Shower shower;

    public SecondFloor(int doors, int windows, Shower shower) {
        super(doors, windows);
        this.shower = shower;
    }
}
