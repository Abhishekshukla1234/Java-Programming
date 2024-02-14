import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Strings2 {
    public static void main(String[] args) {
        //Concatenation
        String firstname = "Abhishek";
        String lastname = "Shukla";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //printlength
        System.out.println(fullname.length());

        //charAt
        for (int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
