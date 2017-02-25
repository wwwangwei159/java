package javatest.stackheap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class stack {


	//先进后出
	    public void testHeap(){
	        LinkedList<Integer> stack = new LinkedList();
	        stack.push(1);
	        stack.push(2);
	        stack.push(7);
	        stack.push(9);
	        for(Iterator it = stack.iterator();it.hasNext();){
	        	System.out.println("i==="+stack.pop());
	        }
	    }
	    //先进先出
	    public void testStack(){
	    	 LinkedList<Integer> queue = new LinkedList();
	    	 queue.offer(3);
	    	 queue.offer(1);
	    	 queue.offer(4);
	    	 queue.offer(5);
	    	 for(Iterator it = queue.iterator();it.hasNext();){
		        	System.out.println("i==="+queue.poll());
		        }
	     }
	    
	    public static void main(String[] args){
	    	stack  t  = new stack ();
	        t.testHeap();
	        t.testStack();   
	    }
	

}
