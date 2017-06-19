package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Game;
import utils.ReadTemplateFile;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		
		ReadTemplateFile rtf = new ReadTemplateFile();
		
		HashMap<String, ArrayList<String>> monDico = new HashMap<String, ArrayList<String>>();
		
		rtf.read(1, monDico);
		
		System.out.println(monDico.get("A").toString());
	}

}
