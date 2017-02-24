package javatest.stackheap;

import java.util.ArrayList;

public class stack {


	    public void testHeap(){
	        for(;;){
	              ArrayList list = new ArrayList (2000);
	          }
	    }
	    int num=1;
	    public void testStack(){
	        num++;
	        this.testStack();
	     }
	    
	    public static void main(String[] args){
	    	stack  t  = new stack ();
	        t.testHeap();
	        //t.testStack();   
	    }
	

}
