import java.util.*;
public class TwoDArrays {
    public static void main(Strings  arg[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] numbers = new int[row][cols];
       //input 
       //rows
       for(int i=0; i<row; i++){
          //colums
          for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
          }
       }

       //output
       for(int i=0; i<row; i++){
        for(int j=0; j<cols; j++){
            System.out.println(numbers[i][j] +" ");
        }
        System.out.println();
       }

    }
}
