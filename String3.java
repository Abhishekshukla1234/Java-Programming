public class String3 {
    public static void main(String[] args) {
        //compare
        String name1 = "Abhishek";
        String name2 = "Abhishek2";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
