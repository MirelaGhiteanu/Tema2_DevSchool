public class HealthyBurger extends BasicHamburger {

    private boolean mushroom = false;
    private boolean pepper = false;

    private float mushroomPrice = 4;
    private float pepperPrice = 5;


    public HealthyBurger(String n, float p, String b, String m){

        super(n,p,"Brown Rye Bread",m);

    }


    @Override
    public void addLetuce() {
        super.addLetuce();
    }

    @Override
    public void addTomato() {
        super.addTomato();
    }

    @Override
    public void addCucumber() {
        super.addCucumber();
    }

    @Override
    public void addCarrot() {
        super.addCarrot();
    }

    public void addMushroom(){
        mushroom = true;
    }

    public void addPepper(){
        pepper = true;
    }

    @Override
    public float finalPrice() {
        float finalPriceH = super.finalPrice();

     if (mushroom == true) {
        finalPriceH = finalPriceH + mushroomPrice;
        }

        if (pepper == true) {
            finalPriceH = finalPriceH + pepperPrice;
        }

        return finalPriceH;
    }

    @Override
    public void BurgerDetails() {
        super.BurgerDetails();
        System.out.println("5. Mushroom: " + mushroomPrice + " $");
        System.out.println("6. Pepper: " + pepperPrice + " $");

    }

    @Override
    public void showFinalPrice() {
        super.showFinalPrice();
    }
}
