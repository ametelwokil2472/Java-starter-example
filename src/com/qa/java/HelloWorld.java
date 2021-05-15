package com.qa.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.print("Hello World");
//		System.out.println(" Hello World");
//		
//		
//		String myString = "This is my string";
//		 System.out.println(myString);
//		 
//		 int myInt;
//		 myInt = 5;
//		 float myfloat = 2.6f;
//		 
//		 System.out.println(myInt);
//			System.out.println(myfloat);
	

	int result = add(10, 20);
	int product = mult(34, 89);
	int diffr = sub(7, 9);
	double dind = div(9, 4);
	
	System.out.println(result);
	System.out.println(product);
	System.out.println(diffr);
	System.out.println(dind);

}

public static int add(int x, int y) {
	return x + y;
}

public static int mult(int x, int y) {
	return x * y;
}

public static int sub(int x, int y) {
	return x - y;
}

public static double div(double x, double y) {
	return x / y;
}
}