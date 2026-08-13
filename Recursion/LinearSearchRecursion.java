public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,43,12,5,67};
        int target = 5;
        int pos = linear(arr,target,0);
        if(pos==-1){
            System.out.println("Target is not found.");
        }
        else{
            System.out.println("Target found at position: "+(pos+1));
        }
    }
    static int linear(int[] arr,int tar,int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index] == tar){
            return index;
        }
        return linear(arr,tar,index+1);
    }
}
