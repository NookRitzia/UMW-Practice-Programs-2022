import java.util.Scanner;
public class ProblemL
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in); // scanner object created since there is more than 1 input
      int messageCount = userInput.nextInt(); // store the amount of messages to encrypt
      String[] messages = new String[messageCount]; // create a string array that stores each message
      String[] output = new String[messageCount]; // create a string array that stores the output
      
      userInput.nextLine(); // java takes the first input as a nextLine, which was an int, so this corrects for it
      
      for (int i = 0; i < messages.length; i++) // loop for all the amount of messages
      {
         messages[i] = userInput.nextLine(); // store the message
         while (messages[i].length() % 4 != 0) // pad the message until its length is divisible by 4
            messages[i] += " ";
      }
            
      for (int i = 0; i < output.length; i++) // loop through all the messages
      {
         output[i] = ""; // initialize the ouput as ""
         
         for (int j = 0; j < messages[i].length(); j++) // perform the character shift on each character in the message then add it to output
            output[i] += charShift(messages[i].charAt(j));
            
         for (int j = 0; j < messages[i].length(); j+=4) // perform the inner outter swap 
         {
            String temp = output[i].substring(j, j+4); // temp var to store the block being swapped
            temp = "" + temp.charAt(3) + temp.charAt(2) + temp.charAt(1) + temp.charAt(0); // swap, ideally you could make a reversed loop but works either way
            output[i] = output[i].substring(0, j) + temp + output[i].substring(j+4); // put the string back together
         }
      }
      
      for (String out : output) // output
         System.out.println(out);
      
   }
   
   
   public static char charShift(char character) // this is the encryption
   {
      // a is 97, z is 122
      // a space is 32
      
      if (character == ' ') // if space just return '_'
         return '_';
         
      int position = (int) character - 97; // cast the char to an int to get its ascii value and then subtract 97 ('a' start at 97)
      position += 11; // add 11 as per instructions
      position %= 26; // get the remainder after dividing by 26
      position += 97; // get back to the ascii world where 'a' starts at 97
      
      return (char) position; // return the character, making sure to cast back to a char
   }
   
}