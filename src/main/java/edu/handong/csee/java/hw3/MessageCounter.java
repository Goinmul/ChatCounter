package edu.handong.csee.java.hw3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MessageCounter {
	
	public HashMap counter(HashMap<String, ArrayList<String>> messages)
	{
		HashMap<String,Integer> counted = new HashMap<String,Integer>();
		
		for(String key: messages.keySet())
		{
			counted.put(key,messages.get(key).size());
		}
		
		return counted;
		
	}
	
}
