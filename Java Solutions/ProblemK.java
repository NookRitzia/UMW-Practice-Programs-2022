import java.util.Scanner;
public class ProblemK
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      int testCases = userInput.nextInt(); // store the value of the amount of test cases
      int[][] numberOfItems = new int[testCases][4]; // initialize the input array in the form numberOfItems[testCaseN][itemIndex]
      
      for (int i = 0; i < numberOfItems.length; i++) // assign the array the correct values
         for (int j = 0; j < numberOfItems[0].length; j++) // nested loop to get input is important to know
            numberOfItems[i][j] = userInput.nextInt();
      
      int[][] output = new int[testCases][4]; // create output array
      
      for (int i = 0; i < testCases; i++) // loop testCases amount of times
      {
         int gold = 20; // total gold we can use
         for (int j = 0; j < 4; j++) // loop through each 4 items
         {
            output[i][j] = Math.min(gold, numberOfItems[i][j]); // assign output as the minimum value between gold and the amount in stock
            gold -= output[i][j]; // if you dont have enough gold, you take the amount of item that the gold can buy, if you have enough gold, you buy all of the items
            // the gold is then adjusted properly
         }
      }
      
      for (int i = 0; i < output.length; i++) // nested loop for the output
      {
         for (int j = 0; j < output[0].length; j++)
         {
            System.out.print(output[i][j] + " ");
         }
         System.out.println();
      }
      
   }
}