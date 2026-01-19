package com.collections.map;
import java.util.*;
public class Frequency {
public static void main (String args[]) {
	String text = "Hello world hello Java";
	Map<String,Integer> map = new HashMap<>();

	for(String w : text.toLowerCase().split("\\W+"))
	 map.put(w,map.getOrDefault(w,0)+1);

	System.out.println(map);

}
}
