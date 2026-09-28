package ConditionalLoops;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Operation : ");
        char ops = sc.next().trim().charAt(0);
        int ans = 0;

        System.out.println("Enter two inputs: ");
        if(ops == '+' || ops == '-' || ops=='*' || ops =='/' || ops =='%') {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            //System.out.println("Enter two inputs: "+num1+num2);
            if (ops == '+') {
                ans = num1 + num2;
            }
            if (ops == '-') {
                ans = num1 - num2;

            }
            if (ops == '*') {
                ans = num1 * num2;
            }
            if (ops == '/') {
                ans = num1 / num2;
            }
            if (ops == '%') {
                ans = num1 % num2;
            } else if (ops == 'x' || ops == 'x') {
                System.out.println("invalid");
            } else {
                System.out.println("invalid Operations");
            }
        }
            System.out.println("Answer :"+ans);

    }
}
