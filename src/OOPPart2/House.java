package OOPPart2;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int size;
    private List<Floor> floors;

    public House(int size, List<Floor> floors) {
        this.size = size;
        this.floors = floors;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
