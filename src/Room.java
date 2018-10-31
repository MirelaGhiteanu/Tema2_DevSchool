public class Room {

    private String sofa;
    private String TV;
    private String lamp;

    public Room(String s, String t, String l){

        this.sofa = s;
        this.TV = t;
        this.lamp = l;
    }

    public String getSofa() {
        return sofa;
    }

    public String getLamp() {
        return lamp;
    }

    public String getTV() {
        return TV;
    }
}
