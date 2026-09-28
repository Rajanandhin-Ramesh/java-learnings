package ConditionalLoops;

import java.util.Scanner;

public class UpperCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char upper = input.next().trim().charAt(0);
        if(upper >= 'a' && upper <='z'){
            System.out.println("Lower case : "+upper);
        }else if (upper >= 'A' && upper <= 'Z'){
            System.out.println("Upper Case : "+upper);
        }

    }
}
