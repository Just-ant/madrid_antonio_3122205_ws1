package griffith;
//Antonio Madrid - 3122205

public class Word{
	private char[] letters;
	
	
		public Word(char[] letters) {
	        this.letters = letters;
	    }


		public boolean contains(char symbol) {
			
			 for (char c : letters) {
		            if (c == symbol) return true;
		        }
		        return false;

			}


		public int length() {
			 return letters.length;

	    }

		

		public char[] getLetters() {
	        return letters; 
	    }
		


}
	

	
