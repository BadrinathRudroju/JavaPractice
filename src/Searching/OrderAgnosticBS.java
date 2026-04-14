package Searching;

    public class OrderAgnosticBS {
        public static void main(String[] args){
            int[] arr = {-2,-1,0,6,7,8,76,99,987};
            int target = 2;
            System.out.println("Index at: " + search(arr,target));
        }
        static int search(int[] arr, int target){
            int start = 0;
            int end = arr.length -1;
            boolean ordercheck = arr[start] < arr[end];

            while(start <= end){
                int mid = start + (end -start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if(ordercheck){
                    if(target < arr[mid]){
                        end = mid -1;
                    }else{
                        start = mid + 1;
                    }
                }else{
                    if(target < arr[mid]){
                        start = mid +1;
                    }else{
                        end = mid -1;
                    }
                }
            }
            return -1;
        }
    }


