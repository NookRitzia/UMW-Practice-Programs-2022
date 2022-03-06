import java.util.Scanner;
public class ProblemA 
{
   public static void main(String[] args)
   {
      // No need to create a scanner object
      // would recommend creating a scanner object if this method is confusing.
      System.out.println("Uncle Jaqarue is " + (new Scanner(System.in).nextInt() + 30) + " years old.");
   }
}