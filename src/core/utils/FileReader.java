package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileReader {

	static final private String TEMPLATE_1 = "";
	static final private String TEMPLATE_2 = "";
	static final private String[] ALPHABET = {"?", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	private int loopSize = 0;
	
	public void read(int template, HashMap<String, ArrayList<String>> alphabet) {
		File file = null;
		
		if (template == 1) {
			file = new File(TEMPLATE_1);
			loopSize = 9;
		} else {
			file = new File(TEMPLATE_2);
			loopSize = 11;
		}
		
		BufferedReader reader = null;

		try {
			java.io.FileReader fr = new java.io.FileReader(file);
			reader = new BufferedReader(fr);

		    String text = null;
		    ArrayList<String> letter = new ArrayList<String>();
		    int cursor = 0;

		    while ((text = reader.readLine()) != null) {
		    		
		    	letter.add(text);
		    	
		    	if (loopSize == 0) {
		    		alphabet.put(ALPHABET[cursor], letter);
		    		cursor++;
		    		letter = new ArrayList<String>();
		    	}
	    		
	    		loopSize--;
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}

	}
	
}
