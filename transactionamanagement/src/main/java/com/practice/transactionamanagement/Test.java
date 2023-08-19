package com.practice.transactionamanagement;

class B {
	int c;
	String d;
}

class A implements Cloneable {

	String a;
	int b;
	B ref;

	@Override
	public A clone() throws CloneNotSupportedException {
		A newObj = (A) super.clone();
		newObj.ref = new B();
		newObj.ref.c = this.ref.c;
		newObj.ref.d = this.ref.d;

		return newObj;
	}
}

public class Test {
	public static void main(String[] args) {
		A obj = new A();
		obj.a = "anuj";
		obj.b = 33;
		obj.ref = new B();
		obj.ref.c = 22;
		obj.ref.d = "helo";

		A obj1 = null;
		try {
			obj1 = obj.clone();
			System.out.println(obj1.a);
			System.out.println(obj1.b);
			System.out.println(obj1.ref.d + " : " + obj1.ref.c);

			obj1.ref.d = "updated";
			obj1.ref.c = 12;

			System.out.println(obj.ref.d + " : " + obj.ref.c);
			System.out.println(obj1.ref.d + " : " + obj1.ref.c);

		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}
}