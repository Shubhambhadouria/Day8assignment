package com.day8q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1 = new Parrot();
		b1.fly();

		Parrot p1 = (Parrot) b1;
		p1.sing();
		//with this b1 reference call the fly method of
		
		
	}

}

