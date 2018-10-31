public class Skoda extends Car {

    public Skoda(int c, String n){
        super(c,n);
    }

    @Override
    public int getWheels() {
        System.out.println("For skoda:");
        return super.getWheels();
    }

    @Override
    public int getCylinders() {
        System.out.println("For skoda:");
        return super.getCylinders();
    }

    @Override
    public boolean isEngine() {
        System.out.println("For skoda:");
        return super.isEngine();
    }

    @Override
    public String getName() {
        System.out.println("For skoda:");
        return super.getName();
    }
}
