package ConditionalLoops;

import java.util.Scanner;

public class SwitchFruits {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruits = scanner.next();
        switch (fruits){
            case "Apple" :
                System.out.println("Red");
                break;
            case "Mango" :
                System.out.println("Yellow fruit");
                break;
            case "Graper" :
                System.out.println("Green or Black fruit");
                break;
            case "Orange" :
                System.out.println("orange fruit");
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
