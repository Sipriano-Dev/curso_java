package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {

		//When the order doesn't matter, HashSet is the better, because it's quicker
		//TreeSet order by alphabetic, but it's a little slower than HashSet
		Set<String> set = new TreeSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) == 'T');


		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}