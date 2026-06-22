import java.util.Arrays;

// Space Complexity: O(1)
// Time Complexity: Best O(N) -> {1,2,3,4} Sorted array
//                  Worst O(N^2) -> {4,3,2,1} Decreasing order
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // Run the steps (n-1) times

        for(int i=0;i< arr.length;i++){
            // initially swapped is set false
            swapped = false;

            // for each pass the max element will come at last position
            // So j < arr.length-i or j <= arr.length-i-1Sort
            for(int j=1;j< arr.length-i;j++){
                // swap if th item is smaller than the previous one
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // if there is swap then swap will be true
                    swapped = true;
                }
            }
            // in the pass if element won't swap least once then it is already sorted
            // There is no need of increasing i further
            // for eg: {1,2,3,4,5}
            if(!swapped){
                break;
            }
        }
    }
}
