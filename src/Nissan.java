public class Nissan extends Car {

    public Nissan(int c, String n){

        super(c,n);
    }

    @Override
    public String getName() {
        System.out.println("For Nissan");
        return super.getName();
    }

    @Override
    public boolean isEngine() {
        System.out.println("For Nissan:");
        return super.isEngine();
    }

    @Override
    public int getCylinders() {
        System.out.println("For Nissan");
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        System.out.println("For Nissan:");
        return super.getWheels();
    }


}
