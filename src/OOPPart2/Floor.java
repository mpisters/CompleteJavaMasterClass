package OOPPart2;

public class Floor {
    private int doors;
    private int windows;

    public Floor(int doors, int windows) {
        this.doors = doors;
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
