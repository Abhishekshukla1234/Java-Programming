import java.util.Scanner;

public class pattern1 {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt() ;
         int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=m; j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
