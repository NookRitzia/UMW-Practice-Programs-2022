import java.util.Scanner;
public class ProblemF
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      
      int gold = userInput.nextInt(); // store amount of gold;
      int[] cost = new int[5]; // create array for cost
      int[] stock = new int[5]; // create array for stock
      int[] needed = new int[5]; // create array for needed
      
      for (int i = 0; i < cost.length; i++)
         cost[i] = userInput.nextInt(); // assign values to cost array
      for (int i = 0; i < stock.length; i++)
         stock[i] = userInput.nextInt(); // assign values to stock array
      for (int i = 0; i < needed.length; i++)
         needed[i] = userInput.nextInt(); // assign values to needed array
         
      for (int i = 0; i < 5; i++) // subtract the amount of the item needed multiplied by the cost (if this number is negative it will add to the gold!)
         gold -= (needed[i] - stock[i]) * cost[i];
      
      String output = "Captain, I need more gold pieces"; // initialize output variable
      if (gold >= 0) // if gold is not negative, output amount of gold, else output the default string
         output = Integer.toString(gold);
      System.out.println(output); // output
      
   }
}