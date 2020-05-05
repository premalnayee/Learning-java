public class Ex2 {

    public static void main(String[] args) {

        Integer[][] object = new Integer[10][10];

        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++){

                object[i][j]=i*10;

                System.out.println(i*10);
            }

        }


    }

}
