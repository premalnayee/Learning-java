public class HelloWorld {

    public String HelloWorld() {
        return "Hello World";
    }

    public void Heya(String output){
        System.out.println(output);
    }

    public static void main(String[] args){
        System.out.println("Hello world");

        HelloWorld object = new HelloWorld();

        System.out.println(object.HelloWorld());

        object.Heya("Banana");
    }
}
