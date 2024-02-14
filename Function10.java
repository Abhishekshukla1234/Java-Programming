import java.util.Scanner;

public class Function10 {
    public static int InfinteLoop(int i){
        do{
            System.out.println(i);
            i++;
        }while(i>=0);
        return i;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        InfinteLoop(i);
    }
}
