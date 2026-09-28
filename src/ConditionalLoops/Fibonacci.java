package ConditionalLoops;


import java.util.Scanner;

//0,1,1,2,3,5,8
public class Fibonacci {
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 2;
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        while (count <= c){

        int temp = a;
        a = a+b;
        b = temp;
        count++;

        }
        System.out.println("Fibonacci Series:" +a);
    }
}
