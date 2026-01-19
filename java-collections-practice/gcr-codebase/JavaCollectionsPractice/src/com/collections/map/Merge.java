package com.collections.map;
import java.util.*;
public class Merge {
public static void main (String args[]) {
	Map<String,Integer> m1 = new HashMap<>(Map.of("A",1,"B",2));
	Map<String,Integer> m2 = Map.of("B",3,"C",4);

	for(String k:m2.keySet())
	 m1.put(k, m1.getOrDefault(k,0)+m2.get(k));

	System.out.println(m1);

}
}
