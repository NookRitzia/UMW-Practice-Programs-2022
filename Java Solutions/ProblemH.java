import java.util.Scanner;
public class ProblemH
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      
      int endPoints = userInput.nextInt(); // store the amount of points in the end
      int largestTier = userInput.nextInt(); // store the largest tier
      
      for (int i = endPoints; i < largestTier; i+= 2) // iterate from endpoints to last tier, incrementing by 2 each time
      {
         for (int j = 0; j < (largestTier - i)/2; j++) // print enough spaces to shift the dots in the center
            System.out.print(" ");
         for (int j = 0; j < i; j++) // print enough dots for the row
            System.out.print(".");
         System.out.println(); // new line
      }
      
      for (int i = largestTier; i >= endPoints; i-= 2) // same thing just in reverse to finish up the bottom half of the diamon
      {
         for (int j = 0; j < (largestTier - i)/2; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print(".");
         System.out.println();
      }
      
   }
}