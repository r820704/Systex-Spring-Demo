package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		String[] names = {"Justin", "caterpillar", "Bush"};
		
//		Comparator<String> comparator = (o1,o2) -> o1.length() - o2.length();
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return StringOrder.byLength(o1, o2);
			}
			
		};
		
//		Arrays.sort(names, (name1, name2) -> StringOrder.byLength(name1, name2));
		Arrays.sort(names, comparator);
		
		for (String string : names) {
			System.out.println(string);
		}
	}

}

class StringOrder {
    public static int byLength(String s1, String s2) {
        return s1.length() - s2.length();
    }
 
    public static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }
 
    public static int byLexicographyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
    
    public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + "::");
		}
	}
}