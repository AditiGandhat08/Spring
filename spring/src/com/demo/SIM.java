//Has-A relation loose coupling
package com.demo;
interface mobile{
	public void connection();
}
class Airtel implements  mobile{
	public void connection() {
		System.out.println("Airtel Connection");
	}
}

class JIO implements  mobile{
	public void connection() {
		System.out.println("JIO Connection");
	}
}


public class SIM {
	private  mobile m= new Airtel();
	public void m() {
		m.connection();
	}
	public static void main(String[] args) {
		SIM s= new SIM();
		s.m();
}
}
