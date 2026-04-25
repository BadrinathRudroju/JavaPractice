package Searching;

//return the element if found else return the index of the greatest element
//that is smaller or equal to target
public class floor {
    public static void main(String[] args){
        int[] arr = {20,23,44,54,555,666};
        int target = 4;
        int ans = bs(arr,target);
        System.out.println(ans);
    }
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        if(target < arr[start]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return end;
    }
}
