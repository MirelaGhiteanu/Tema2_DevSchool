public class Housse {

    private String door;
    private String window;
    private Room living;

    public Housse(String d, String w, Room l){

        this.door = d;
        this.window = w;
        this.living = l;
    }

    public Room getLiving() {
        return living;
    }

    public String getDoor() {
        return door;
    }

    public String getWindow() {
        return window;
    }
}
