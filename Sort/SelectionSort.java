import java.util.Arrays;
// Complexity: 1> Time : Best and Worst O(N^2)

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,0,72,-32,4,2,67};
        select(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void select(int[] arr){

        for(int i=0;i< arr.length; i++){
            // Find the max element in the array and swap it with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
