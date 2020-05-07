import java.util.ArrayList;

public class Goldilock_10 {

    boolean isGoldieCoolWithIt(int weight, int temperature){
        if (weight>=100 && temperature<=80){
            return true;
        } else return false;
    }

    public ArrayList<Integer> whichChairsAreHotRightNow(ArrayList<Integer> weightList, ArrayList<Integer> temperatureList) {
        ArrayList<Integer> HotChairs = new ArrayList<>();

        for (int i = 0; i <weightList.size(); i++ ) {
            if (isGoldieCoolWithIt(weightList.get(i), temperatureList.get(i))) {
                HotChairs.add(i++);
            }
        }
        return HotChairs;
    }

    public ArrayList<Integer> findTheChairsFromFile(String filePath){
        ReadFiles obj = new ReadFiles(filePath);
        obj.ReadFile();
        return whichChairsAreHotRightNow(obj.getWeightList(), obj.getTemperatureList());
    }

    public static void main(String[] args) {

        Goldilock_10 obj1 = new Goldilock_10();
        obj1.findTheChairsFromFile("files/Input.txt");

    }
}
