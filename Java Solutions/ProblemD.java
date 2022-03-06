import java.util.Scanner;
public class ProblemD
{
   public static void main(String[] args)
   {
      // 3 oz/L + 4 oz/S = 10 TP
      // 10 L = 3 oz/L
      
      Scanner userInput = new Scanner(System.in); // create a scanner object since there are two inputs
      
      int leaves = userInput.nextInt(); // store # of leaves into leaves
      int ozChloride = userInput.nextInt(); // store # of ounces of Chloride into ozChloride
      
      int ozLeaves = 3 * leaves / 10; // ounces of leaves is the integer division of the amount of leaves divided by 10 and then multiplied by 3
      
      int tpBatches = ozLeaves / 3; // amount of batches that can be made from just the leaves
      
      if (ozChloride / 4 < tpBatches) // if the amount of batches that can be made from the 
         tpBatches = ozChloride / 4;  // cloride is less than that of tpBatches, set tpBatches equal to it
         
      System.out.println(tpBatches * 10); // output total sheets of toilet paper
   }
}