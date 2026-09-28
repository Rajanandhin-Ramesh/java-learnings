package ConditionalLoops;

import java.util.Scanner;

//Largest of 3 numbers
public class Largest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;

        /* Method 1
        if(b > max){
            max = b;
        }
        System.out.println(max);
        if (c > max){
            max = c;

        }

        System.out.printf("Largest of 3 numpers" +max);*/


/*Method 2
        int maxi = Math.max(c,Math.max(a,b));
        System.out.println("Largest of 3 numbers : "+maxi);*/


      /*Method 3  if(a>max){
            max=a;
        }else {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);*/
    }
}
