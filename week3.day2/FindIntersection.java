package week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a= new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);

		List<Integer> b= new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		System.out.print("a= "+ a);
		System.out.println();
		System.out.print("b= "+ b);
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		LinkedList intersectNode = null;  
		intersectNode = List(list1, list2);  
		System.out.println("The first intersection point of the linked lists does not exist. ");
	}
		

	public void LinkedListNode(l1) 
	{  
	while(l1 != null)  
	{  
	System.out.print(l1.d + " ");  
	l1 = l1.nxt;  
	}  
	}  
