package LoopsPracticeQuestions;

public class PrintNumbers {
    static void main(String[] args) {
        printnum();
        printrev();
        printEven();
        printOdd();
        multiply();
        sumOfNDigit();

    }
    static void printnum(){
        for(int i=1;i<=10;i++){
            System.out.println("Output :"+i);
        }
    }
    static void printrev(){
        for (int i = 10; i>=1;i--) {
            System.out.println(i);
        }
    }
    static void printEven(){

        for(int n = 1; n<=50; n++){
            int e = n;
            if(e%2==0){
                System.out.println("even numbers : "+e);
            }
        }
    }
    static void printOdd(){
        for(int n=1; n<=50;n++){
            int o=n;
            if(o%2!=0){
                System.out.println("odd numbers : "+o);
            }
        }
    }
    static void multiply(){
        for(int i=1;i<=10;i++){
            int n=5;
            int ans = n*i;
            System.out.println(n+" x "+i+" = "+ans);

        }
    }
    static void sumOfNDigit(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            System.out.println(i);


        }
    }
}
