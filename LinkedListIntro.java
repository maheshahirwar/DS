package DataStructureFramework.linkedlist;

import java.util.*;

public class LikedListIntro {

	public static void main(String[] args) {
		List<Integer>ll = new LinkedList<>();
		List<Integer>al = new ArrayList<>();
		getTimeDiff(al);
		getTimeDiff(ll);
	}
	static void getTimeDiff(List<Integer>list) {
		long start=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"-->"+(end-start));
	}

}
