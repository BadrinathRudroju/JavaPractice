package Searching;

/* A mountain array is an array where the array start from ascending order and
then gradually decreases. It is also known as bi-tonic array.
ex = {1,2,3,4,5,6,4,3,2,1}
 */

/*
In this example we are finding the peak of the mountain array
 */
public class MountainArray {
    static void main() {
        int[] arr = {1,2,4,5,6,7,4,3,2,1};
        System.out.println( "Found at index of: " + FindPeakInMountainArray(arr));
    }

    static int FindPeakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1 ;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
