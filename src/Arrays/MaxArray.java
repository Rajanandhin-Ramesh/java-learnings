package Arrays;

public class MaxArray {
    static void main(String[] args) {
        int input[] = {1,2,3,66,77,88,99,23,33};

        System.out.println( maximum(input));
        System.out.println(maxRange(input,0,5));
    }
    static int maximum(int arr[]){
        int maxValue = arr[0];
        for (int i = 1 ; i< arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;

    }

    static int maxRange(int[] arr, int start,int end){
        int maxValue = arr[start];
        for (int i = start; i<=end;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }return maxValue;
    }
}
