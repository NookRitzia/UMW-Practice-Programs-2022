import java.util.Scanner;
public class ProblemJ
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      int testCases = userInput.nextInt(); // store the amount of test cases
      
      for (int i = 0; i < testCases; i++) // loop testCases amount of times
      {
         int num = userInput.nextInt(); // store the input number
         int total = 0; // initialize the sum of the factors
         
         for (int j = 1; j < num; j++) // loop from 1 to the number
         {
            if (num % j == 0) // if j is a factor, add it to total and print it out
            {
               total += j;
               System.out.print(j + " ");
            }
         }
         
         String output = total == num ? "YES" : "NO"; // ternary statement, doesn't need to be used, but its good to know
         System.out.println(output); // print yes if the sum of the factors is equal to the num, else, print no
      }
   }
}