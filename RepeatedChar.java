package com.protechsoft.test;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {
	static char pickChar(String str) {
 		int i,len = str.length();
		Map<Character,Integer> kvPair = new HashMap<Character,Integer>();		
		for(i=0;i<len;i++) {
			char letter = str.charAt(i);
			kvPair.put(letter, kvPair.getOrDefault(letter,0)+1);
			if(kvPair.get(letter)>1)
				return letter;
			else
				continue;
		}
		return '-';
	}
	public static void main(String[] args) {
		String str = "engineering";
		str.toLowerCase();
		System.out.println(pickChar(str));
	}
}
