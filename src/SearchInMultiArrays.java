
import java.util.Arrays;

public class SearchInMultiArrays {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1,23,4},
                {2,4,5,5},
                {3,2,4,2}
        };
        int target = 3;
        System.out.println("Target found at index: " + Arrays.toString(search(arr,target)));
        System.out.println("Maximum of array is: " + max(arr));
        System.out.println("Minimum of array is:"  + min(arr));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[] {-1};
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    return arr[i][j];
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        int min = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(min > arr[i][j]){
                    return arr[i][j];
                }
            }
        }
        return min;
    }
}
