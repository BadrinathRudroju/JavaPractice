public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,7,5};
        int target = 5;
        System.out.println(searchinrange(arr,target,2,5));
    }

    static String searchinrange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return "Does not exist";
        }
        for(int i=start; i<= end; i++){
            if(arr[i] == target){
            return "At index: " + i;
            }
        }
        return "Element not found";
    }
}
