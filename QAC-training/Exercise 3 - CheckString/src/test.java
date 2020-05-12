public class test {

    public static void main(String[] args) {
        String str = "abc";
        String new_str = "";

        for (String c : str){
            for (int i=0 ; i<=1;i++){
                new_str += c;
            }
        }
        System.out.println(new_str);
    }

}
