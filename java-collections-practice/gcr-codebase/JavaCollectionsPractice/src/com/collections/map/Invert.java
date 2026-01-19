package com.collections.map;
import java.util.*;
public class Invert {
public static void main (String args[]) {
	Map<String,Integer> map = Map.of("A",1,"B",2,"C",1);
	Map<Integer,List<String>> inv = new HashMap<>();

	for(String k:map.keySet())
	 inv.computeIfAbsent(map.get(k),x->new ArrayList<>()).add(k);

	System.out.println(inv);

}
}
