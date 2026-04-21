package CoreJava;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        while(again) {

            double a, b;
            System.out.print("Enter first number: ");
            a = scanner.nextInt();
            System.out.print("Enter second number: ");
            b = scanner.nextInt();

            System.out.print("choose operator +,-,*,/,%:  ");
            String op = scanner.next();

            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("undefined");
                    }
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Enter valid operator");
            }

            System.out.println("do you want to continue:(true/false)");
            again = scanner.nextBoolean();
            if(!again){
                System.out.println("okay! bye");
            }

        }
    }
}
