
    import java.util.Scanner;

public class function5 {
    public static int Average(int a,int b,int c){
        int avg = (a+b+c)/2;
        return avg;
    }
 public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int avg = Average(a, b, c);
    System.out.println("Average of 3 number is "+" "+avg);
 }    
}

