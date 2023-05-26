
/**
 * The SecretWord class manages the secret word and handles user guesses.
 * 
 * @author Tejpreet Bal
 * @version 1.0
 * @Date May 26, 2023
 */
public class SecretWord {
	private String secretWord;
	private String displayWord;
	
	 /**
     * Sets SecretWord with a default secret word.
     * The replaceChars method is called to set secretWord with asterisks and assign it to displayWord.
     */
	public SecretWord() { 
		secretWord = "food";
		displayWord = replaceChars(secretWord, '*');
		
	}
	
	 /**
     * Replaces all characters in the given string with the specified replacer character.
     * @param secretWord The original string to be replaced
     * @param replacer The character used for replacement
     * @return The replaced string
     */
	public String replaceChars(String secretWord, char replacer){		
		for(char c='A'; c<='z'; c++) {
			secretWord = secretWord.replace(c, replacer);
		}
		
		return secretWord;
	}
	
	 /**
     * Replaces the characters in the displayed word with the specified character at the positions
     * where the given character occurs in the secret word.
     * @param s1 The original displayed word
     * @param s2 The updated displayed word with the replaced characters
     * @param ch The character to replace
     */
	public void replaceChars(String s1, String s2,  char ch){	
		
		StringBuilder sb = new StringBuilder(displayWord);		
		for(int index=0; index <= secretWord.length()-1; index++) {
			if(secretWord.charAt(index) == ch) {
				sb.setCharAt(index, ch);
			}
		}
		displayWord = sb.toString();
	}
	
	 /**
     * Retrieves the current displayed word.
     * @return The displayed word
     */
	public String getDisplayedWord() {
		return displayWord;
	}
	
	/**
     * Checks for the guess character in the secret word and updates the displayed word accordingly.
     * @param ch The character guessed
     * @return true if the guess is correct, false otherwise
     */
	public Boolean makeGuess(char ch) {
		int letterIndex = secretWord.indexOf(ch);
		if (letterIndex == -1) {
			return false;
		}
		
		else {
			
			replaceChars(secretWord, displayWord, ch);
			return true;
		}			
	}

}
