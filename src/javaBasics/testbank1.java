package javaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testbank1 {

	
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		findDuplicateWords("i love java is a java hard to learn is ");
          
        
}
	
	  public static void findDuplicateWords(String inputstring) {
		 String words []  = inputstring.split(" ");
		 Map<String, Integer> wordcount = new HashMap<String , Integer>();
		 
		 for(String word:words) {
			 if(wordcount.containsKey(word)) {
				 wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			 }else {
				 wordcount.put(word, 1);
			 }
			 Set <String> wordString = wordcount.keySet();
			 for(String word1: wordString) {
				 if(wordcount.get(word1)>1) {
					System.out.println(word1+ "" + wordcount.get(word1)); 
				 }
			 }
		 }
	  }
}