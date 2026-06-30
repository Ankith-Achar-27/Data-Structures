import java.util.Arrays;
// Time: O(n²) worst cases and O(n) in best case.
// Space: O(1).

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,-3,6,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
