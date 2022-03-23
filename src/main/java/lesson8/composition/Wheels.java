package lesson8.composition;

public class Wheels {
    private int wheelsSize;
    private int wheelWidth;
    private boolean isAlloyRims;

    public Wheels(int wheelsSize, int wheelWidth, boolean isAlloyRims) {
        this.wheelsSize = wheelsSize;
        this.wheelWidth = wheelWidth;
        this.isAlloyRims = isAlloyRims;
    }

    public int getWheelsSize() {
        return wheelsSize;
    }

    public int getWheelWidth() {
        return wheelWidth;
    }

    public boolean isAlloyRims() {
        return isAlloyRims;
    }
}
