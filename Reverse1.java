
import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);    
    String text=in.nextLine();
        boolean result = reverseWords(text);
        System.out.println("Operation successful: " + result);
    }

    public static boolean reverseWords(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        String rev = "";
        String[] words = text.split(" ");
    for (String word : words) {
       // word = Hello
        String reversedWord = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            reversedWord += word.charAt(j);
        // reversedWord = o (1) l(2) l(3)e(4) H(5)
        }
        
        rev += reversedWord + " ";
    }
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + rev); 
        return true; 
}}
