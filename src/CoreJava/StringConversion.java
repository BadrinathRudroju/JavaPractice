package CoreJava;

import java.util.Arrays;

public class StringConversion {
    static void main() {
        String a = "UD";
        char[] b = a.toCharArray();
        int U = 1;
        int D = -1;
        int sum =0;
        for(char arr : b){
            sum = sum + (arr - '0');
        }
        System.out.println(sum);
    }
}
