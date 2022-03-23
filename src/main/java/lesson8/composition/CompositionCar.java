package lesson8.composition;

public class CompositionCar {

    private Body body;
    private Engine engine;
    private Wheels wheels;
    private String manufacturer;
    private String model;

    public CompositionCar(Body body, Engine engine, Wheels wheels, String manufacturer, String model) {
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
        this.manufacturer= manufacturer;
        this.model=model;
    }
    public void goSomewhere(){
        body.openDoors();
        body.closeDoors();
        engine.startEngine();
    }

}
