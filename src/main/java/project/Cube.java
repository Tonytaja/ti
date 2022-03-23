package project;

public class Cube extends Volume {
    private double edge;
    public Cube(double edge){
        this.edge=edge;
    }

    @Override
    public double calculateTheVolume() {
        return edge*edge*edge;
    }
}

