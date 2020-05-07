//import java.util.ArrayList;
//
//public class Comp {
//
//    public static void main(String[] args){
//        doggoArray();
//        placifier("5");
//        System.out.println(placifier("2"));
//    }
//
//    public static void doggoArray(){
//        ArrayList<String> DoggoTable = new ArrayList<>();
//
//        for (int i = 0; i<100 ; i++){
//            DoggoTable.add(String.valueOf(i+1));
//        }
//    }
//
//    public static String placifier(String place){
//        String[] names1_10 = {"st", "nd", "rd", "th"};
//
//        if(Integer.parseInt(place) < 20){
//                Integer int_place = Integer.parseInt(place);
//                    if (int_place <=3){
//                        return names1_10[int_place-1];
//                    } else{
//                        return names1_10[3];
//                    }
//            else{
//                return "0";
//            }
//        }
//        else if(Integer.parseInt(place) < 100){
//            return "0";
//        }
//        else{
//            return "0";
//        }
//        return "0";
//    }
//
//}
