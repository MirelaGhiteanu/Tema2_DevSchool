

public class Duster extends Car {

    public Duster(int c, String n){
        super(c,n);
    }

    @Override
    public boolean isEngine() {
        System.out.println("For Duster:");
        return super.isEngine();

    }

    @Override
    public int getCylinders() {
        System.out.println("For Duster:");
        return super.getCylinders();
    }

    @Override
    public String getName() {
        System.out.println("For Duster:");
        return super.getName();
    }

    @Override
    public int getWheels() {
        System.out.println("For Duster:");
        return super.getWheels();
    }
}
