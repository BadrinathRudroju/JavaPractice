public class MInMaxInArray {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6};
        System.out.println( "Minimum of array is: " + min(arr));
        System.out.println("Maximum of array is: " + max(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
