public class Human extends Animal{
    float height;
    float weight;

    public Human(String colour, float height, float weight) {
        super(2, colour, false);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void sound() {
        System.out.println("Hi");;

    }
}
