import java.util.ArrayList;

public class DoggoCompSequalMethods {

    public ArrayList createTable(){
        ArrayList<String> League = new ArrayList<>();
        String Modifier = "";
        for(int Position = 1; Position <= 100; Position++){

            switch (Position%10){
                case 1:
                    if(Position == 11){
                        Modifier = "th";
                        break;
                    }
                    else {
                        Modifier = "st";
                        break;
                    }
                case 2:
                    if(Position == 12){
                        Modifier = "th";
                        break;
                    }
                    else {
                        Modifier = "nd";
                        break;
                    }
                case 3:
                    if(Position == 13){
                        Modifier = "th";
                        break;
                    }
                    else {
                        Modifier = "rd";
                        break;
                    }
                default:
                    Modifier = "th";
                    break;

            }

            League.add(String.valueOf(Position + Modifier));
        }
        return League;
    }

    public void getPos(int Position){
        System.out.println(createTable().get(Position-1));
    }
    public ArrayList yourPos(int Position){
         ArrayList YourDoggo = createTable();
         YourDoggo.set(Position-1, "YourDoggo");
         return YourDoggo;
    }

}
