package Arrays;

import java.util.Arrays;

public class ArrayConcepts {
    static void main(String[] args) {
        int rollno[] = {100,102,103,104,105};
        arraysBasic(rollno);
        System.out.println(Arrays.toString(rollno));

    }
    static void arraysBasic(int arr[])
    {
       arr[0] = 101;
        System.out.println(Arrays.toString(arr));
        //or
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
