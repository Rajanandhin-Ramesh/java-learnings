package Arrays;

import java.util.Scanner;

public class TwoDArray {
    static void main(String[] args) {
        /*
        123
        56
        789
         */
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[3][3];
       // num = sc.nextInt();
        //input
        for(int row = 0; row < num.length; row++){
            for (int col = 0; col < num[row].length; col++){
                num[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row = 0; row < num.length; row++){
            for (int col = 0; col < num[row].length; col++){
                System.out.print(num[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
