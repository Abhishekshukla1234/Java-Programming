import java.util.Scanner;

public class function6 {
    public static int calculateSum(int n ){
        int sum = 0;
        for (int i=1; i<=n; i++ ){
            if(i%2!=0){
                System.out.println(i);  
               sum =sum +i;
            }
    
            }
            return sum;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int sum = calculateSum(n);
       System.out.println("sum of odd number is"+" "+sum);
            
        
    }
}
