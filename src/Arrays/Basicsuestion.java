package Arrays;

import java.util.Arrays;

public class Basicsuestion {
    static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int sum =0;
        System.out.println(arr.length);


        System.out.println(Arrays.toString(arr));
//        System.out.println();

        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
            System.out.println(arr[i]);

        }
        System.out.println(sum);
    }
}
