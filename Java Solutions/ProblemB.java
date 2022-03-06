import java.util.Scanner;
public class ProblemB
{
   public static void main(String[] args)
   {
      int year = new Scanner(System.in).nextInt(); // year is assigned to the input
      int deltaYear = year - 2021; // deltaYear stores the # of years that have passed
      
      System.out.println(10000 + deltaYear * 50); // # of graduating seniors is 50/year. 50 * yearsPassed + 9000 = total population
   }
}