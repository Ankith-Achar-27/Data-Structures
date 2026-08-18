import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindIndexArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int target = 4;
        ArrayList<Integer> list = findIndex(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> findIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> addBelowCalls = findIndex(arr,target,index+1);
        list.addAll(addBelowCalls);
        return list;
    }
}
