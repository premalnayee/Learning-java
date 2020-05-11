public class Dog extends Animal{
    String Breed;
    int toesOnPaw;


    public Dog( String colour, boolean furry, String breed, int toesOnPaw) {
        super(4, colour, furry);
        this.Breed = breed;
        this.toesOnPaw = toesOnPaw;
    }

    public Dog(int legs, String colour, boolean furry) {
        super(legs, colour, furry);
    }

    @Override
    public void sound() {
        System.out.println("Bark!");;

    }
}
