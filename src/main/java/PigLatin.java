import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    return ("There are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        return (pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    // your code goes here
          if (sWord.substring(0, 2).equals("qu")) {
    return (sWord.substring(2, sWord.length()) + "quay");
  }
  else if (findFirstVowel(sWord) == 0){
    return (sWord + "way");
  }
  else if (findFirstVowel(sWord) >= 2){
    return (sWord.substring(findFirstVowel(sWord), sWord.length()) + sWord.substring(0, findFirstVowel(sWord)) + "ay");
  }
  else if (findFirstVowel(sWord) != -1)
  {
    return (sWord.substring(1, sWord.length()) + sWord.substring(0, 1) + "ay");
  }
  else if (findFirstVowel(sWord) == -1) {
    return (sWord + "ay");
  }
  
  else {
    return "ERROR!";
  }
    }
}//end PigLatin class
