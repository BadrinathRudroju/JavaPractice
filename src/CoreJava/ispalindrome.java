package CoreJava;

import java.util.Scanner;

public class ispalindrome {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter word to confirm if it is palindrome");
      String word = scanner.nextLine();
      System.out.println(pal(word));
      scanner.close();
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
}

