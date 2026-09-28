package Arrays;

import java.util.Arrays;

public class SwapArray {
    static void main(String[] args) {
        int arr[] = {1,2,3,66,77,88,99,23,33};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int num[],int arr1,int arr2){

        int temp =num[arr1];
       num[arr1] = num[arr2];
        num[arr2] =temp;

    }
}
