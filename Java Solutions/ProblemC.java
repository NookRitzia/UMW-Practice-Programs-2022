import java.util.Scanner;
public class ProblemC
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // scanner object is created since we need 2 inputs
      String word1 = userInput.nextLine(); // word1 is the first inputted line
      String word2 = userInput.nextLine(); // word2 is the second inputted line
      
      int deltaLength = word1.length() - word2.length(); // subtract the length of the 2 words
      String output = "TIE"; // incase the length is the same, we will output "TIE"
      
      if (deltaLength > 0) // if the first word is longer than the second output the first
         output = word1;
      if (deltaLength < 0) // if the second word is longer than the second, output the second
         output = word2;
         
      System.out.println(output); // output the correct word 
   }
}