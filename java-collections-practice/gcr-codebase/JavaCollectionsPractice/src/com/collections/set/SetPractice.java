package com.collections.set;
import java.util.*;
public class SetPractice {
 public static void main (String args[]) {
	 Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
	 Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
	 System.out.println(s1.equals(s2));
	 
	 Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
	 Set<Integer> b = new HashSet<>(Arrays.asList(3,4,5));

	 Set<Integer> union = new HashSet<>(a);
	 union.addAll(b);

	 Set<Integer> intersection = new HashSet<>(a);
	 intersection.retainAll(b);

	 System.out.println(union);
	 System.out.println(intersection);
	 
	 
	 Set<Integer> result = new HashSet<>(a);
	 result.addAll(b);

	 Set<Integer> temp = new HashSet<>(a);
	 temp.retainAll(b);

	 result.removeAll(temp);
	 System.out.println(result);
	 
	 Set<Integer> re = new HashSet<>(a);
	 result.addAll(b);

	 Set<Integer> tem = new HashSet<>(a);
	 temp.retainAll(b);

	 result.removeAll(temp);
	 System.out.println(result);

	 
	 Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));
	 List<Integer> list = new ArrayList<>(set);
	 Collections.sort(list);
	 System.out.println(list);

	 
	 Set<Integer> s11 = Set.of(2,3);
	 Set<Integer> s22 = Set.of(1,2,3,4);
	 System.out.println(s22.containsAll(s11));


 }
}
