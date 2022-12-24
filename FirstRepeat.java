package com.protechsoft.test;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeat {
	static char pickChar(String str) {
 		int i,len = str.length();
 		char res = ' ';
		Map<Character,Integer> kvPair = new HashMap<Character,Integer>();		
		for(i=len-1;i>=0;i--) {
			char letter = str.charAt(i);
			kvPair.put(letter, kvPair.getOrDefault(letter,0)+1);
			if(kvPair.get(letter)>1)
				res = letter;
			else
				continue;
		}
		return res;
	}
	public static void main(String[] args) {
		String str = "engineering";
		str.toLowerCase();
		System.out.println(pickChar(str));
	}
}
