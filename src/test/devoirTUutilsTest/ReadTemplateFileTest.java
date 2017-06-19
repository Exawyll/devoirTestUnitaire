/**
 * 
 */
package devoirTUutilsTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import utils.ReadTemplateFile;

/**
 * @author WYLLIAM
 *
 */
public class ReadTemplateFileTest {

	@Test
	public void readTest() {
		ReadTemplateFile rtf = new ReadTemplateFile();
		
		final HashMap<String, ArrayList<String>> monDico = new HashMap<String, ArrayList<String>>();
		
		rtf.read(1, monDico);
		
		ArrayList<String> myLetter = new ArrayList<String>();
		
		myLetter = monDico.get("A");
		
		for (int i = 0; i < myLetter.size(); i++) {
			assertTrue(myLetter.get(i) instanceof String);
		}
	}

}
