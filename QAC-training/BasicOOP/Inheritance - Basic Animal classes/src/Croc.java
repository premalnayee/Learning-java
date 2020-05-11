public class Croc extends Animal {

    boolean scales;
    float length;

    public Croc( String colour, boolean scales, float length) {
        super(4, colour, false);
        this.scales = scales;
        this.length = length;
    }

    @Override
    public void sound() {
        System.out.println("Grrr");;

    }
}
