package DataStructureFramework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList<>();
		List<String>l=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Mango");
		l.add("Hii");
		l.add("Mahesh");
		l.add("hama");
		System.out.println(fruits);
		fruits.addAll(l);
		System.out.println(fruits);
	    System.out.println(fruits.get(5));
	    System.out.println(fruits.set(4, "Nams"));
	    fruits.removeAll(l);
	    System.out.println(fruits);
	    System.out.println(fruits.size());
	    System.out.println(fruits.contains("Mahesh"));
	    System.out.println(fruits.isEmpty());
	    String [] str = new String[fruits.size()];
	    fruits.toArray(str);
	    for(String e:str) {
	    	System.out.println(e+" ");
	    }
	}
}
