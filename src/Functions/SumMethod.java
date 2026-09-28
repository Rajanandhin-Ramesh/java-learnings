package Functions;

import java.util.Scanner;

public class SumMethod {
    static void main(String[] args) {
        int addition =addi();
        System.out.println(addition);

    }
    static int addi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1= scanner.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        return sum;
    }
}
