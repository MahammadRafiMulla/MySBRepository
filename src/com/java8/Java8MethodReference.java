package com.java8;



@FunctionalInterface
interface AbcInterface{
	public int operation(int x);
}
public class Java8MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lambda expression
		AbcInterface rrr=(x)->(x*x);
		System.out.println(rrr.operation(50));

		Java8MethodReference object=new Java8MethodReference();
		
		//method refenrece through static method
		AbcInterface ref1=Java8MethodReference::squareIt;
		System.out.println(ref1.operation(10));
		
		//method reference through instance method
		AbcInterface ref2=object::qubeIt;
		System.out.println(ref2.operation(10));
	}
public static int squareIt(int n) {
	return n*n;
	
}

public int qubeIt(int n) {
	return n*n*n;
}
}
