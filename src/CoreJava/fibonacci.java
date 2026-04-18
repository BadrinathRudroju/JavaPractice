package CoreJava;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        fib(n);
    }
        public static void fib(int n){
        int a = 0, b = 1;
           for (int i = 0; i < n; i++) {
            System.out.print( a +" ");
            int temp = a + b;
            a = b;
            b = temp;
           }
        }
  }


