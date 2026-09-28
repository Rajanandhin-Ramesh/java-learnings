package Arrays;

public class Average {
    static void main(String[] args) {
        int input[] = {10,20,30,40,50,1,99};
        int sum = 0;
        for (int i = 0; i<input.length;i++){
            sum = sum+input[i];
        }
        System.out.println("Sum : "+sum);
        double avg;
        avg=sum/input.length;
        System.out.println("Average : "+avg);
    }
}
