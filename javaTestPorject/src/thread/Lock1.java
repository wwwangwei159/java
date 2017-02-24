package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock1 {

	private long counter;
	
	private long count;
	
	Lock myLock = new ReentrantLock();
	
	public void add(long value) {
	    myLock.lock();
	    try {
	        this.count = this.count + value;
	    } finally {
	        myLock.unlock();
	    }
	}
	
	public void add1(long value){
		
		myLock.lock();
		try{
			this.count = this.count +  value;
		}finally{
			myLock.unlock();
		}
		
	}
	
	
	public void add(int value) {
	    myLock.lock();
	    try {
	        while (counter <= 5) {
	            //等待直到大于5
	        }
	        this.count = this.count + value;
	    } finally {
	        myLock.unlock();
	    }
	}
	
	
	public synchronized void addInnerLock(int value) {
	    try {
	        
	    } finally {
	    	
	    }
	}
	
	
	
	
	
}
