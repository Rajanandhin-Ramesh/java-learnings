package Arrays;

import java.util.Arrays;

public class LargestElement {
    static void main(String[] args) {
        int input[] = {10,20,30,40,50,1,99,88};
        System.out.println("large value : "+large(input));
        System.out.println("second value : "+second(input));
        System.out.println("small value : "+small(input));
    }
    static int second(int arr1[]){
        int largeVal = arr1[0];
        int second = arr1[0];
        for(int i = 1; i<arr1.length;i++){
            if(arr1[i]>largeVal){
                second = largeVal;
                largeVal =arr1[i];
            }
            else if(arr1[i]>second){
                second=arr1[i];

            }
        }return second;
    }
    static int large(int arr[]){
        int largeVal = arr[0];
        for(int i = 1; i< arr.length;i++){

            if(arr[i]>largeVal){
                largeVal=arr[i];

            }
        }return largeVal;

    }
    static int small(int[] sma){
        int smallvalue = sma[0];
        for(int i = 1; i<sma.length;i++){
            if(smallvalue>sma[i]){
                smallvalue=sma[i];
            }
        }
        return smallvalue;
    }
}
