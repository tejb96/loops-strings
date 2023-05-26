
/**
 * @author Tejpreet Bal
 *
 */
public class SecretWord {
	private String secretWord;
	private String displayWord;
	
	public SecretWord() { 
		secretWord = "food";
		displayWord = replaceChars(secretWord, '*');
		
	}
	
	public String replaceChars(String secretWord, char replacer){		
		for(char c='A'; c<='z'; c++) {
			secretWord = secretWord.replace(c, replacer);
		}
		
		return secretWord;
	}
	
	public void replaceChars(String s1, String s2,  char ch){	
		
		StringBuilder sb = new StringBuilder(displayWord);		
		for(int index=0; index <= secretWord.length()-1; index++) {
			if(secretWord.charAt(index) == ch) {
				sb.setCharAt(index, ch);
			}
		}
		displayWord = sb.toString();
	}
	
	public String getDisplayedWord() {
		return displayWord;
	}
	
	public Boolean makeGuess(char ch) {
		int letterIndex = 0;
		letterIndex = secretWord.indexOf(ch);
		if (letterIndex == -1) {
			return false;
		}
		
		else {
			
			replaceChars(secretWord, displayWord, ch);
			return true;
		}			
	}

}
