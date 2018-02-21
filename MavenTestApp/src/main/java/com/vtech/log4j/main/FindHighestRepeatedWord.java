package com.vtech.log4j.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
 * Author@ Raghavender Vodapally
 * Date@ Jul 2, 2017
 */
public class FindHighestRepeatedWord {

	public static void main(String[] args) {
		
		System.out.println("Helli Git!!");
		
		String s = "I love my india india is india india is greatest love india";
		
		System.out.println("String = "+s);
		
		findMostRepeatedWord(s);
		
	}
	
	public static void findMostRepeatedWord(String s){
		
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		
		String[] stringArray = s.split(" ");
		
		for(String str: stringArray){
			if(!wordCountMap.containsKey(str)){
				wordCountMap.put(str, 1);
				
			}
			else{
				wordCountMap.put(str, wordCountMap.get(str) + 1);
				
			}
		}
		
		
		//Getting most repeated word and its occurance
		String mostRepeatedWord = null;
		int count = 0;
		
		Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
		
		for(Entry<String, Integer> entry: entrySet){
			if(entry.getValue() > count){
				mostRepeatedWord = entry.getKey();
				count = entry.getValue();
			}
		}
		
		System.out.println("\nMost Repeated Word: "+mostRepeatedWord);
		System.out.println("Occurance: "+count);
		
		//find count for "love"
		String findWord = "love";
		int findWordCount=0;
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getKey().equals(findWord)) {
				findWordCount = entry.getValue();
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println(findWord+" : "+ findWordCount);
		
		
	}

}

