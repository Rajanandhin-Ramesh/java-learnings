package Arrays;

public class EvenorOdd {
    public static void main(String args[]){
        int n=1569090909;
        n= n%10;
        System.out.println("Last digit :"+n);
//        isEven(n);
        System.out.println(isEven(n));

    }

    static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }
}
