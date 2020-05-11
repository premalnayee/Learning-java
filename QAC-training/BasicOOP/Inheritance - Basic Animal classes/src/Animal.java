public class Animal {
    int legs;
    String colour;
    boolean furry;

    public Animal(int legs, String colour, boolean furry) {
        this.legs = legs;
        this.furry = furry;
    }

    public void sound(){
        System.out.println("Insert sound");
    }

    public void describe(){
        System.out.println(legs+""+colour+furry);
    }

}
