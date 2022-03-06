import java.util.Scanner;
public class ProblemG
{

   // Really recommend drawing this one out, and the way
   // that the spiraling works. It will make more sense why
   // the middle number is needed and how the print methods work
   
   public static int length; // set length to the first input
   public static int[][] steps; // create 2d array to store the stair values
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // create a scanner object since there is more than 1 input
      length = userInput.nextInt(); 
      steps = new int[length][length]; 
      
      for (int i = 0; i < length; i++) // get the stair values, steps[xPos][yPos]
         for (int j = 0; j < length; j++)
            steps[j][i] = userInput.nextInt();
        
      int middleNum = steps[steps.length/2][steps.length/2]; // store the number in the middle of the array - this will be used if the dimension of the array is odd
   
      while (length > 1) // until we get to the middle, do the stuff inside the while loop
      {
         printHorizontal(0, false); // prints the top horizontal part of the array from the 1st element to the last element in the row
         printVertical(length - 1, false); // print the right vertical part of the array from the 2nd element to the last element in the column
         printHorizontal(length - 1, true); // print the bottom horizontal part of the array from the 2nd to last element to the first element in the column
         printVertical(0, true); // print the left vertical part of the array from the 2nd to last element to the 2nd element in that column
         shrinkArray(); // shrink the array
      }
      
      if (length == 1) // if dimensions were originally odd, print the middle num
         System.out.print(middleNum); // the length will always be 1 if original dimension was odd
   }
   
   public static void printHorizontal(int yPosition, boolean reversed) // prints a row at a specified yPosition
   {
      if (reversed) // prints the row from length - 2 index to the 0th index
         for (int i = length - 2; i >= 0; i--)
            System.out.print(steps[i][yPosition] + " ");
      else // prints the row from the 0th index to the length - 1 index
         for (int i = 0; i < length; i++)
            System.out.print(steps[i][yPosition] + " "); 
   }
   
   public static void printVertical(int xPosition, boolean reversed)
   {
      if (reversed) // prints the column from the length - 2 index to the 1st index
         for (int i = length - 2; i > 0; i--)
            System.out.print(steps[xPosition][i] + " ");
      else // prints the column from the 1st index to the length - 1 index
         for (int i = 1; i < length; i++)
            System.out.print(steps[xPosition][i] + " "); 
   }
   
   public static void shrinkArray() // shrinks the array, cutting of one column from the left and right, and one row from the top and bottom, this results in an array with dimensions length-2
   {
      int[][] newArray = new int[length - 2][length - 2]; // make the new array with dimensions length - 2
      length -= 2; // update global counter
      for (int i = 0; i < length; i++) // set new array values
         for (int j = 0; j < length; j++)
            newArray[i][j] = steps[i+1][j+1];
      steps = newArray; // set global array to new array
   }  
}