import java.util.Scanner;
public class ProblemM
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner obejct since there is more than 1 input
      int testCases = userInput.nextInt(); // store amount of test cases
      int[][] gameInformation = new int[testCases][2]; // initialize game information array in the form gameInformation[amountOfGames][participantCount/exitCount]
      int[] output = new int[testCases]; // store the output
      
      for (int i = 0; i < gameInformation.length; i++) // nested loop to store the input
         for (int j = 0; j < gameInformation[0].length; j++)
            gameInformation[i][j] = userInput.nextInt();
      
      for (int i = 0; i < output.length; i++) // calculate all of the output
         output[i] = playGame(gameInformation[i][0], gameInformation[i][1]);
         
      for (Integer num : output) // output the solution
         System.out.println(num);
      
   }
   
   public static int[] ascendingArray(int length) // creates an ascending array from 1 to the length e.g. length = 4, return {1, 2, 3, 4}
   {
      int[] toReturn = new int[length]; // creates the array
      
      for (int i = 0; i < toReturn.length; i++) // assigns ascending values
         toReturn[i] = i + 1;
         
      return toReturn; // returns the array
   }
   
   public static int[] pruneArray(int[] array) // gets rid of the element with the value -1
   {
      int[] toReturn = new int[array.length - 1]; // makes an array that is 1 size smaller than the parameter array
      int index = 0; //  start at index 0
      for (int i = 0; i < array.length; i++) // loop the whole array passed as the parameter
      {
         if (array[i] != -1) // if that element is -1 dont include
         {
            toReturn[index] = array[i]; // assign the correct value into the array to be returned
            index++; // increment index only if the array's element is not -1
         }
      }
      
      return toReturn; // return the array
   }
   
   public static int playGame(int players, int exitCount) // simulates the game
   {
      int[] playerArray = ascendingArray(players); // creates an array of the players
      int indexOn = 0; // store the index we are on
      while (playerArray.length != 1) // while there are 2 or more players
      {
         int count = 1; // start the count at 1
         
         while (count != exitCount) // while the count has not reached the exit count
         {
            indexOn = (indexOn + 1) % playerArray.length; // increment index by 1, modulus is used to make sure we loop back to 0 when we go too far 
            count++; // increment count
         }
         
         playerArray[indexOn] = -1; // exited player has a value of -1
         playerArray = pruneArray(playerArray); // remove the exited player
      }
      
      return playerArray[0]; // return the last player remaining
   }
}