/**
 * 
 */
package devoirTestUnitaire;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import model.AsciiArt;

import org.junit.Test;

/**
 * @author jerome
 *
 */
public class AsciiArtTest {

	/**
	 * Test method for {@link model.AsciiArt#AsciiArt(int)}.
	 */
	@Test
	public void testAsciiArt() {

		try {
			AsciiArt aArt = new AsciiArt(1);
			HashMap<String, ArrayList<String>> alphabet = aArt.getAlphabet();
			assertEquals(27, alphabet.size());
		} catch (Exception e) {
			fail("exception thrown");
		}
		
		try {
			AsciiArt aArt = new AsciiArt(2);
			HashMap<String, ArrayList<String>> alphabet = aArt.getAlphabet();
			assertEquals(27, alphabet.size());
		} catch (Exception e) {
			fail("exception thrown");
		}
		
	}
	
	@Test (expected = Exception.class)
	public void testAsciiArtExcep() throws Exception {
		AsciiArt aArt = new AsciiArt(3);
	}
}
