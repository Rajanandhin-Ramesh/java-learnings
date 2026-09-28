package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int input[] = {1,2,19,4,55,22,88,34,56,90,77};
        int target =90;
        int ans = linearSearch(input,target);
        boolean ans1 = linearSearch2(input,target);
        int ans3 = linearSearch3(input,target);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans3);



    }
    static int linearSearch(int arr[], int target){
        //search if not found in array
        if(arr.length==0){
            return -1;
        }
        //search if elements is present in elements or not
        for(int index = 0; index < arr.length; index++){
            int elements = arr[index] ;
            if(elements == target){
                return index;
            }

        }

        //this line will be executed when target not found
        return -1;
    }
    // search the target and return true or false
    static boolean linearSearch2(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for(int elements : arr){
            if(elements == target){
                return true;
            }
        }return false;

         /*for(int index = 0; index < arr.length; index++){
            int elements = arr[index] ;
            if(elements == target){
                return index;
            }

        }*/

    }

    //search the target and return the element
    static int linearSearch3(int arr[], int target){
        //search if not found in array
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        //search if elements is present in elements or not
        for(int elements : arr){

            if(elements == target){
                return elements;
            }

        }

        //this line will be executed when target not found
        return Integer.MAX_VALUE;
    }
}
