import java.util.Scanner;

public class function3 {
    public static int calculatemulti(int a, int b){
        int multi = a*b;
        return multi;
    }
        public static void main (Strings[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int multi = calculatemulti(a, b);
            System.out.println("multiple of two number is"+" "+multi);
            
        }

}
