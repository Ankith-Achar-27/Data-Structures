import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findLastIndex(arr,target, arr.length-1));
        System.out.println(findAllIndex(arr,target,0,list));

    }
    static boolean find(int[]arr,int tar,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == tar || find(arr, tar, index+1);
    }
    static int findIndex(int[] arr, int tar, int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index] == tar){
            return index;
        }
        return findIndex(arr,tar,index+1);
    }
    static int findLastIndex(int[] arr, int tar, int index){
        if(index== -1){
            return -1;
        }
        if(arr[index] == tar){
            return index;
        }
        return findIndex(arr,tar,index-1);
    }
    static ArrayList findAllIndex(int[] arr,int tar,int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index] == tar){
            list.add(index);
        }
        return findAllIndex(arr, tar, index+1,list);
    }
}
