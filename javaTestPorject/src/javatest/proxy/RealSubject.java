package javatest.proxy;

public class RealSubject implements Subject {

	public RealSubject() {}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(" From real method1. ");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println(" From real method2. ");
		
	}

}
