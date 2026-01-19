package com.collections.queue;
import java.util.*;
public class Generate {
public static void main (String args[]) {
	Queue<String> q = new LinkedList<>();
	q.add("1");

	for (int i = 0; i < 5; i++) {
	    String s = q.remove();
	    System.out.println(s);
	    q.add(s + "0");
	    q.add(s + "1");
	}

}
}
