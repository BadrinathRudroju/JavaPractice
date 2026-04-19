package CoreJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ispalindrome {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter digit or word to confirm if it is palindrome");
      try {
          if(scanner.hasNextInt()) {
              int n = scanner.nextInt();
              System.out.println(palnum(n));
              scanner.close();
          }else{
              String name = scanner.nextLine();
              System.out.println(pal(name));
          }
          scanner.close();
      } catch (InputMismatchException e) {
          System.out.println("Please enter valid option");
      }
  }
public static boolean pal(String word){
     word = word.toLowerCase();
     for(int i=0; i<word.length()/2;i++){
         char start = word.charAt(i);
         char end = word.charAt(word.length()-1-i);
          if(start != end){
             return false;
          }
     }
     return true;
   }

   public static boolean palnum(int n){
      int original = n;
      int reversed =0;
      if(n<0){
          return false;
      }
      while(n>0){
          int rem = n % 10;
          reversed = reversed * 10 + rem;
          n = n /10;
      }
     return original == reversed;
   }
}

