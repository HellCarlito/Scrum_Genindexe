package core;

/**
 * This class helps us to modify a String
 * @author Groupe 1
 *
 */
public class WordUtils
{
	/**
	 * Method to capitalize each first letter of a word
	 * @param word
	 * @return
	 */
	 public static String capitalize(String word)
	 {
		 String[] words = word.split(" ");
		 StringBuilder sb = new StringBuilder();
		 if (words[0].length() > 0)
		 {
			 sb.append(Character.toUpperCase(words[0].charAt(0)) + words[0].subSequence(1, words[0].length()).toString().toLowerCase());
			 for (int i = 1; i < words.length; i++)
			 {
				 sb.append(" ");
				 sb.append(Character.toUpperCase(words[i].charAt(0)) + words[i].subSequence(1, words[i].length()).toString().toLowerCase());
			 }
		 }
		 return  sb.toString();
	 }
}
