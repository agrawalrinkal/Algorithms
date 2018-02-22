/*
Given one sentence at a time, return the second last word of the sentence. (15 mins)
*/

import java.util.ArrayList;

public class RemoveSecondLast {
  public static void main(String args[]) {
    String str = "  Hey there how are you doing!";
    String result = extractSecondLastWord(str);
    System.out.println(result);
  }

  public static String extractSecondLastWord(String str) {
    str = str.trim();
    String[] stringArray = str.split("\\s+");
    if (stringArray.length > 1)
      return stringArray[stringArray.length - 2];
    return "";
  }

  public static String removeSecondLastWord(String str) {
    str = str.trim();   // removeLast leading and tailing spaces
    if (str.isEmpty()) return "";
    String word = "";
    char[] charStr = str.toCharArray();
    int lead = 0;
    int follow = 0;     // Used as a mediator to keep track of starting index of current word
    int preFollow = 0;  // Keeps track of th starting index of previous word

    while (lead < charStr.length) {
      // Update the prefollow index after a new word is discovered
      preFollow = follow;
      follow = lead;
      // Updates the lead index until a new word ends or finds the first space
      while (charStr[lead] != ' ') {
        // If lead reaches the end of the string then it returns the previous word
        if (lead == charStr.length - 1) {
          // Gets the previous word using preFollow index
          while(preFollow != charStr.length  && charStr[preFollow] != ' ')  {
            word += charStr[preFollow];
            preFollow++;
          }
          return word;
        }
        lead++;
      }
      // Updates the lead index to cruze through all the spaces
      while (charStr[lead] == ' ') lead++;
      // System.out.println("Lead- " + lead + " PreFollow- " +  preFollow);
    }
    return "Failure finding 2nd last word!";
  }
}
