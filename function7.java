import java.util.Scanner;

public class function7 {

    public static int greaterValve(int a, int b){
        if(a>b ){
            System.out.println("A is grester"+ a);
        }
        else{
            System.out.println("B is greater"+" "+ b);
        }
        return 0;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterValve(a, b);
    }
}
