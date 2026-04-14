package Searching;

    public class LinearSearch {
        public static void main(String[] args){
            int[] arr = {1,3,45,5,5,6,6,4};
            int target = 3;
            int result = Linearsearch(arr,target);
            System.out.println("Element found at "+result);
        }

        static int Linearsearch(int[] arr, int target){
            if(arr.length ==0 ){
                return -1;
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i] == target){
                    return i+1;
                }
            }
            return -1;
        }
    }

