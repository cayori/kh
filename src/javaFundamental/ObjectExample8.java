package javaFundamental;

import java.util.LinkedList;

public class ObjectExample8 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(123);
		int a;
		System.out.print( a = list.removeLast() );
	}
}
