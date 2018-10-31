public class BasicHamburger {

    private String name;
    private float price;
    private String breadRollType;
    private String meat;

    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;
    private boolean cucumber = false;

    private float lettucePrice = 3;
    private float tomatoPrice = 4;
    private float carrotPrice = 5;
    private float cucumberPrice = 6;

    public BasicHamburger(String n, float p, String b, String m){

        this.name = n;
        this.price = p;
        this.breadRollType = b;
        this.meat = m;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void addLetuce(){

        lettuce = true;
    }

    public void addTomato(){

        tomato = true;
    }

    public void addCarrot(){

        carrot = true;
    }

    public void addCucumber(){

        cucumber = true;
    }


    public float finalPrice(){

        float finalPrice = price;

        if (lettuce == true){
            finalPrice = finalPrice + lettucePrice;
        }

        if(tomato == true){
            finalPrice = finalPrice + tomatoPrice;
        }

        if(carrot == true){
            finalPrice = finalPrice +carrotPrice;
        }

        if(cucumber == true){
            finalPrice = finalPrice + cucumberPrice;
        }

        return finalPrice;
    }


    public void BurgerDetails() {
        System.out.println("Base price for " + name + " is " + price);
        System.out.println("The available additions are:");
        System.out.println("1. Lettuce: " + lettucePrice + " $");
        System.out.println("2. Tomato: " + tomatoPrice + " $");
        System.out.println("3. Carrot: " + carrotPrice + " $");
        System.out.println("4. Cucumber: " + cucumberPrice + " $");

    }

    public void showFinalPrice(){
        System.out.println("The final price after additions: "+finalPrice());

    }


}
