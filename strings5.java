public class strings5 {
 // concatenation
    public static void main(String[] args) {
        String firstName = "Abhishek";
        String lastName = "Shukla";
        String fullName = firstName + "Kumar" + lastName;
        //Abhishek@Shukla
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
         
    }
}
