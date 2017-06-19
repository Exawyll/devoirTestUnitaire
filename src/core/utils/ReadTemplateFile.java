package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadTemplateFile {

	static final private String FILEPATH = System.getProperty("user.dir") + "\\resources\\";
	static final private String TEMPLATE_1 = "template1.txt";
	static final private String TEMPLATE_2 = "template2.txt";
	static final private String[] ALPHABET = {"?", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	private int loopSize = 0;
	
	public void read(int template, final HashMap<String, ArrayList<String>> alphabet) {
		File file = null;
		
		if (template == 1) {
			file = new File(FILEPATH + TEMPLATE_1);
			loopSize = 9;
		} else {
			file = new File(FILEPATH + TEMPLATE_2);
			loopSize = 11;
		}
		
		BufferedReader reader = null;

		try {
			java.io.FileReader fr = new java.io.FileReader(file);
			reader = new BufferedReader(fr);

		    String text = null;
		    ArrayList<String> letter = new ArrayList<String>();
		    int cursor = 0;
		    int counter = loopSize;

		    while ((text = reader.readLine()) != null) {
		    		
		    	letter.add(text);
		    	
		    	if (counter <= 1) {
		    		alphabet.put(ALPHABET[cursor], letter);
		    		cursor++;
		    		letter = new ArrayList<String>();
		    		counter = loopSize;
		    	}
	    		
		    	counter--;
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
