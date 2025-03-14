package exercise;

// BEGIN
public class Cottage implements Home {
    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public int getFloorCount() {
        return floorCount;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return getFloorCount() + " этажный коттедж "
                + "площадью " + getArea() + " метров";
    }
}
// END
