import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFiles {

    private String filePath;
    ArrayList<Integer> weightList = new ArrayList<>();
    ArrayList<Integer> temperatureList = new ArrayList<>();

    public ReadFiles(String filePath) {
        this.filePath = filePath;
    }

    public void ReadFile() {
                try {
                    File myObj = new File(filePath);
                    //myObj.createNewFile();

                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        String[] data_split = data.split(" ");
                        weightList.add( Integer.valueOf(data_split[0]) );
                        temperatureList.add(Integer.valueOf(data_split[1]));
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        }

        //public Integer[][] importToList()

    public ArrayList<Integer> getWeightList() {
        return weightList;
    }

    public void setWeightList(ArrayList<Integer> weightList) {
        this.weightList = weightList;
    }

    public ArrayList<Integer> getTemperatureList() {
        return temperatureList;
    }

    public void setTemperatureList(ArrayList<Integer> temperatureList) {
        this.temperatureList = temperatureList;
    }

    public static void main(String[] args) {

    }

}
