package LoopsPracticeQuestions;

import java.util.Scanner;

public class FactorialNum {

    static void main(String[] args) {
        printFactorial();
        printCount();


    }
    static void printFactorial(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for (int i = 1; i<=n;i++){
            fact = fact*i;
           }
        System.out.println("Factorial :"+fact);
    }
    static void printCount(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
