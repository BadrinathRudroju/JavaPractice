package CoreJava;

public class IsArmstrong {
     static void main(String[] args){
        System.out.println(arm(153));
    }
    static boolean arm(int num){
        int original = num;
        int sum =0;
        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        return sum == original;
    }
}
