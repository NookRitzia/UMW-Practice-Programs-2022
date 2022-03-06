import java.util.Scanner;
public class ProblemI
{
   public static void main(String[] args)
   {
      // this problem is quite poorly worded
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      int nCases = userInput.nextInt();
      int[] output = new int[nCases];
      
      for (int i = 0; i < nCases; i++)
      {
      
      }
      System.out.println(ifTripleScoop(123))
   }
   
   public static boolean ifTripleScoop(int num)
   {
      String n = Integer.toString(num);
      int[] digits = new int[n.length];
      for (int i = 0; i < n.length; i++)
         digits[i] = (int) n.charAt(i);
      int lastDigit = digits[0];
      for (int digit : digits)
         if (digit <
      
      return true;
   }
   
}