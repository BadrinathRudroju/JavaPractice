package Searching;


//return the index value of target if found else return smallest element index
//that is greater than or equal to target

public class ceiling {
    static void main() {
        int[] arr = {1,23,44,54,555,666};
        int target = 57;
        System.out.println(ceil(arr,target));
    }

    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(target > arr[end]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return start;
    }
}
