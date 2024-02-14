import java.util.Scanner;

public class function11 {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in) ;
        int  X = sc.nextInt();
        System.out.println("Enter the integer:");
        int [] data = new int [X];
        for (int i = 0; i<data.length; i++ ){
            System.out.println("Enter the Number "+(i+1));
            data[i]=sc.nextInt();
        }

         int count = 0;
         int positive = 0;
         int negative = 0;
         for(int i: data){
            if (i > 0) {
                positive++;
            }
            else if(i <0){
                negative++;
            }
            else if (i == 0){
                count++;
            }
         }
         System.out.println("Positive Number :"+" "+positive );
         System.out.println( "negative Number :"+" "+negative );
         System.out.println("Zero number :"+" "+count);
            

        }
    }



        
    

