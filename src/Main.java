public class Main {

    public static void main(String args[]){

        Car c1 = new Car(6,"masina");
        Duster d1= new Duster(4,"masinaa");
        int nr = d1.getCylinders();
        System.out.println(nr);

        HealthyBurger h1 = new HealthyBurger("healthyBurger",4,"Brown Rye Bread","chicken");
        h1.addLetuce();
        h1.addMushroom();
        h1.BurgerDetails();
        h1.showFinalPrice();

        DeluxeHamburger dex1 = new DeluxeHamburger("deluxehamburger",7,"Brown Rye Bread","chicken");
        dex1.DeluxeDetails();
        dex1.showFinalPrice();
    }
}
