package javatest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RealSubject rs = new RealSubject(); //real Object
		
		InvocationHandler handler = new DynamicSubject(rs);
		
		Class cl = rs.getClass();

		Subject sub =  (Subject) Proxy.newProxyInstance(cl.getClassLoader(), cl.getInterfaces(), handler);
		
		sub.method1();
		sub.method2();
		
	}

}
