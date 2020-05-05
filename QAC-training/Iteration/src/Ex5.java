public class Ex5 {

    void start(){

        for (int i=1; i<=10 ; i++){
            for (int j=1; j <= i; j++){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Ex5 object = new Ex5();

        object.start();
    }
}
