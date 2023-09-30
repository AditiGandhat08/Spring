//Has-A relation tight coupling
package com.demo;
class Car{
	public void cardetail() {
		System.out.println("4 seater");
	}
	public void speeddetail() {
		System.out.println("90 km/hr");
	}
}
public class Maruti extends Car {
	@Override
	public void speeddetail() {
		System.out.println("100 km/hr");
	}
	public void modeldetail() {
		System.out.println("Maruti800");
	}
	
	public static void main(String[] args) {
		Maruti m= new Maruti();//static binding
		m.cardetail();
		m.speeddetail();
		m.modeldetail();
		Car c=new Maruti();//upcasting/dynamuc binding
		c.cardetail();
		c.speeddetail();
		//c.modedetail();only overridden methods are called in upcasting
		
	}

}
