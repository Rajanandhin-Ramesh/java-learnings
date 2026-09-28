package Functions;


import java.util.Scanner;

//sum of 2 numbers
//do this for 10 times
public class Addition {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1=scanner.nextInt();
        int num2 = scanner.nextInt();
        int ans = num1+num2;

        System.out.println("Answer :"+ans);
    }
}
