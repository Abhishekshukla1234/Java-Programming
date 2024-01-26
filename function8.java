import java.util.Scanner;

public class function8 {

    public static float findCircumference (Float r){
        float d = (2*(22/7)*r);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
    
        float d = findCircumference(r);
        System.out.println("Circumference of Circle:"+" "+d);

    }
}
