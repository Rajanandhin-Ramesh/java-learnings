package Arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int arr[] = {12,13,78,65,5,98,80,567};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }
    static void swap(int num[],int arr1,int arr2){
        int temp =num[arr1];
        num[arr1] = num[arr2];
        num[arr2] = temp;
    }
}
