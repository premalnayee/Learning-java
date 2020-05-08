import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RunnerReader {
        private String filePath;
        private Golilock_class golilock_class;
        private ArrayList<Place> places = new ArrayList<>();
        private int counter;
        private int luminosity = 70;

        public RunnerReader(String filePath) {
            this.filePath = filePath;
        }

        public void ReadFile() {

            try {
                File myObj = new File(filePath);
                //myObj.createNewFile();

                Scanner myReader = new Scanner(myObj);

                golilock_class = new Golilock_class(myReader.nextInt(),
                        myReader.nextInt(),
                        luminosity);

                while (myReader.hasNextInt()) {
                    Integer data0 = myReader.nextInt();
                    Integer data1 = myReader.nextInt();
                    Integer data2 = myReader.nextInt();

//                    System.out.println(data1+""+data2+""+data3);
                    //String[] data_split = data1.split(" ");
                    //System.out.println(data);
                    //Integer[] data_split_int = convertStringArrayIntArray(data_split);

                    Place place = new Place(
                            new Porridge(data1),
                            new Chairs(data0, data2),
                            counter++);

                    places.add(place);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }


        public Integer[] convertStringArrayIntArray ( String[] s) {
            Integer[] ints1 = new Integer[s.length];
            int i = 0;
            for(String s_item: s) {

                ints1[i] = Integer.parseInt(s_item);
                i++;
            }
            return ints1;
        }

        public ArrayList<Integer> isGoldCoolWithIt(){
            ArrayList<Integer> coolChairs = new ArrayList<>();

            for (Place p : places){
                if (p.isGoldieCoolWithIt(golilock_class)){
                    coolChairs.add(p.getPlaceID());
                }
            } return coolChairs;
        }

// Getters and setters
        public ArrayList<Place> getPlaces() {
            return places;
        }

        public void setPlaces(ArrayList<Place> places) {
            this.places = places;
        }

        public int getLuminosity() {
            return luminosity;
        }

        public void setLuminosity(int luminosity) {
            this.luminosity = luminosity;
        }

    public static void main(String[] args) {

        RunnerReader obj = new RunnerReader("files/Input3.txt");
        obj.ReadFile();
        System.out.println(obj.isGoldCoolWithIt());



    }
}

