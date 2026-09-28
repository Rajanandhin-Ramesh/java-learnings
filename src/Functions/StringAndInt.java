package Functions;

import java.util.Arrays;

public class StringAndInt {
    static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int a =10;
        int b= 20;
        swap(a,b);
        System.out.println("Inside psvm:"+a+" "+b);
        String name = "Nandhini";
        mainName(name);
        mainInt(num);
        System.out.println(name);
        System.out.println(Arrays.toString(num));
    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println(num1
        +" "+num2);
    }

    static void mainName(String names) {
        names = "Rajanandhini";

    }
    static void mainInt(int[] nums){
         nums[0] = 99;

    }
}
