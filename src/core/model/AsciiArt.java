package model;

import java.util.ArrayList;
import java.util.HashMap;

public class AsciiArt {

	private HashMap<String, ArrayList<String>> alphabet;
	
	private ArrayList<String> interrogation;
	private ArrayList<String> a;
	private ArrayList<String> b;
	private ArrayList<String> c;
	private ArrayList<String> d;
	private ArrayList<String> e;
	private ArrayList<String> f;
	private ArrayList<String> g;
	private ArrayList<String> h;
	private ArrayList<String> i;
	private ArrayList<String> j;
	private ArrayList<String> k;
	private ArrayList<String> l;
	private ArrayList<String> m;
	private ArrayList<String> n;
	private ArrayList<String> o;
	private ArrayList<String> p;
	private ArrayList<String> q;
	private ArrayList<String> r;
	private ArrayList<String> s;
	private ArrayList<String> t;
	private ArrayList<String> u;
	private ArrayList<String> v;
	private ArrayList<String> w;
	private ArrayList<String> x;
	private ArrayList<String> y;
	private ArrayList<String> z;
	
	private final int letterNb = 27;
	private int template;

	/**
	 * @param template
	 * @throws Exception 
	 */
	public AsciiArt(int template) throws Exception {
		this.template = template;
		this.initLetters(template);
		this.createTemplate(template);
	}

	

	/**
	 * @return the alphabet
	 */
	public HashMap<String, ArrayList<String>> getAlphabet() {
		return alphabet;
	}



	/**
	 * @param alphabet the alphabet to set
	 */
	public void setAlphabet(HashMap<String, ArrayList<String>> alphabet) {
		this.alphabet = alphabet;
	}



	/**
	 * @param template
	 * @throws Exception 
	 */
	private void createTemplate(int template) throws Exception {
		switch (template) {
		case 1:
			for (int i = 0; i < letterNb; i++) {
				
			}
			break;

		case 2:
			
			break;
			
		default :
			throw new Exception("wrong number");
		}
		
	}
	
	
	/**
	 * @param template
	 * @throws Exception 
	 */
	private void initLetters(int template) throws Exception {
		switch (template) {
		case 1:
			this.interrogation = new ArrayList<String>(9);
			this.a = new ArrayList<String>(9);
			this.b = new ArrayList<String>(9);
			this.c = new ArrayList<String>(9);
			this.d = new ArrayList<String>(9);
			this.e = new ArrayList<String>(9);
			this.f = new ArrayList<String>(9);
			this.g = new ArrayList<String>(9);
			this.h = new ArrayList<String>(9);
			this.i = new ArrayList<String>(9);
			this.j = new ArrayList<String>(9);
			this.k = new ArrayList<String>(9);
			this.l = new ArrayList<String>(9);
			this.m = new ArrayList<String>(9);
			this.n = new ArrayList<String>(9);
			this.o = new ArrayList<String>(9);
			this.p = new ArrayList<String>(9);
			this.q = new ArrayList<String>(9);
			this.r = new ArrayList<String>(9);
			this.s = new ArrayList<String>(9);
			this.t = new ArrayList<String>(9);
			this.u = new ArrayList<String>(9);
			this.v = new ArrayList<String>(9);
			this.w = new ArrayList<String>(9);
			this.x = new ArrayList<String>(9);
			this.y = new ArrayList<String>(9);
			this.z = new ArrayList<String>(9);

			
			break;

		case 2:
			this.interrogation = new ArrayList<String>(11);
			this.a = new ArrayList<String>(11);
			this.b = new ArrayList<String>(11);
			this.c = new ArrayList<String>(11);
			this.d = new ArrayList<String>(11);
			this.e = new ArrayList<String>(11);
			this.f = new ArrayList<String>(11);
			this.g = new ArrayList<String>(11);
			this.h = new ArrayList<String>(11);
			this.i = new ArrayList<String>(11);
			this.j = new ArrayList<String>(11);
			this.k = new ArrayList<String>(11);
			this.l = new ArrayList<String>(11);
			this.m = new ArrayList<String>(11);
			this.n = new ArrayList<String>(11);
			this.o = new ArrayList<String>(11);
			this.p = new ArrayList<String>(11);
			this.q = new ArrayList<String>(11);
			this.r = new ArrayList<String>(11);
			this.s = new ArrayList<String>(11);
			this.t = new ArrayList<String>(11);
			this.u = new ArrayList<String>(11);
			this.v = new ArrayList<String>(11);
			this.w = new ArrayList<String>(11);
			this.x = new ArrayList<String>(11);
			this.y = new ArrayList<String>(11);
			this.z = new ArrayList<String>(11);
			break;
			
		default :
			throw new Exception("wrong number");
		}
		
	}
	
	
	
}
