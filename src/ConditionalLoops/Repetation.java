package ConditionalLoops;

import java.util.Scanner;
 //n = 1 3 5 7 8 7 9 7
public class Repetation {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int a = input.nextInt();
        while (a>0)
        {
           int rem = a%10;
           if(rem == 7){
               count++;
           }
           a=a/10;

        }
        System.out.println(count);



    }
}
