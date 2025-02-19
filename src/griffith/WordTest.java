package griffith;
//Antonio Madrid - 3122205
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	

	    @Test
	    public void testContains() {
	        Word word = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});

	        assertTrue(word.contains('h'));
	        assertTrue(word.contains('o'));
	        assertFalse(word.contains('z'));
	        assertFalse(word.contains('x'));
	    }

	    @Test
	    public void testLength() {
	        Word word1 = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});
	        Word word2 = new Word(new char[] {'a', 'b', 'c'});
	        Word word3 = new Word(new char[] {});

	        assertEquals(5, word1.length());
	        assertEquals(3, word2.length());
	        assertEquals(0, word3.length());
	    }

	    @Test
	    public void testNotNull() {
	        Word word = new Word(new char[] {'t', 'e', 's', 't'});

	        assertNotNull(word.getLetters());
	    }
	}
