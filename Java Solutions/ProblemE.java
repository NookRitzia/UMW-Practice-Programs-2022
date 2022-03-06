import java.util.Scanner;
public class ProblemE
{
   public static void main(String[] args)
   {
      int input = new Scanner(System.in).nextInt(); // store input into input
      
      for (int i = 1; i < input; i++) // iterate from 1 to input - 1
      {
         if (i % 15 == 0) // if divisible by 15, print Fizz Buzz
            System.out.print("Fizz Buzz, ");
         else if (i % 3 == 0) // if divisible by 3, print Fizz
            System.out.print("Fizz, ");
         else if (i % 5 == 0) // if divisible by 5, print Buzz
            System.out.print("Buzz, ");
         else
            System.out.print(i + ", "); // else, print the number
      }
      
      if (input % 15 == 0) // repeat whole process, but include period at the end
         System.out.print("Fizz Buzz.");
      else if (input % 3 == 0)
         System.out.print("Fizz.");
      else if (input % 5 == 0)
         System.out.print("Buzz.");
      else
         System.out.print(input + "."); 
   }
}