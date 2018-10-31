public class DeluxeHamburger extends BasicHamburger {

    private boolean chips = true;
    private boolean drinks = true;

    private float ChipsPrice = 10;
    private float DrinksPrice = 6;

    public DeluxeHamburger(String n, float p, String b, String m) {

        super(n, p, b, m);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public float finalPrice() {
        float finalPriceD = super.finalPrice() + ChipsPrice + DrinksPrice;
        return finalPriceD;
    }


    public void DeluxeDetails() {
        System.out.println("Base price for " + getName() + " is " + getPrice());
        System.out.println("The authomatic additions are:");
        System.out.println("1. Chips: " + ChipsPrice + " $");
        System.out.println("2. Drinks: " + DrinksPrice + " $");
    }

    @Override
    public void showFinalPrice() {
        super.showFinalPrice();
    }
}
