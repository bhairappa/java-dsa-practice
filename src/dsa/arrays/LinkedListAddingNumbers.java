package dsa.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import dsa.arrays.ReverseLinkedList.Node;

public class LinkedListAddingNumbers {
	int data;
	Node next;

	LinkedListAddingNumbers(int data){
		this.data =data;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lt =new LinkedList<>();
		Set<Integer> st = new HashSet<>();
		lt.add(1);
		lt.add(5);
		lt.add(4);
		lt.add(4);
		System.out.println(lt);
        lt.addFirst(9);
        System.out.println(lt);
        lt.addLast(1);
        lt.add(4,88);
        System.out.println(lt);
        Iterator<Integer> it = lt.iterator();
       while(it.hasNext()) {
    	   int val = it.next();
        if(st.contains(val)) {
        	it.remove();
        }st.add(val);
        }
       System.out.println(st);
	}
	}
