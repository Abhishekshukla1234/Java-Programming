import java.util.Scanner;

public class function2 {
    public static int calculateSum(int a, int b){
        int sum = a+b;
    return sum;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculateSum(a,b);
       System.out.println("sum of two number is"+ " "+sum);
      
    }
}
