import java.util.Scanner;

public class function9 {
    public static int CheckEligible(int age){
        if (age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        CheckEligible(age);
        
    }
}
