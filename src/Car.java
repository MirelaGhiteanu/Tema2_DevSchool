public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int c, String n){

        this.engine = true;
        this.cylinders = c;
        this.name = n;
        this.wheels = 4;
    }

    public boolean isEngine() {
        System.out.println("The engine is ready!");
        return engine;
    }

    public int getCylinders() {
        System.out.println("The cylinders are ready!");
        return cylinders;
    }

    public String getName() {
        System.out.println("The car is ready!");
        return name;
    }

    public int getWheels() {
        System.out.println("The wheels are ready!");
        return wheels;
    }


}
