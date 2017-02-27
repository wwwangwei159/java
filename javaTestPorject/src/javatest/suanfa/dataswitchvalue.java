package javatest.suanfa;

public class dataswitchvalue {

	public static void main(String[] args) {
		
		int a=10,b=12; //a=1010^b=1100;
		a=a^b; //a=0110^b=1100;
		System.out.println(a+"-------"+b);
		b=a^b; //a=0110^b=1010;
		System.out.println(a+"-------"+b);
		a=a^b; //a=1100=12;b=1010;
		System.out.println(a+"------"+b);

	}

}
