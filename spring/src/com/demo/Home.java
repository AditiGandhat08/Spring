//Has-A relation loose coupling
package com.demo;

interface Network{
	public void getConnection();
}

class LanNetwork implements Network{
	public void getConnection() {
		System.out.println("LAN Network Connection");
	}
}

class MTNLNetwork  implements Network{
	public void getConnection() {
		System.out.println("MTNL Network Connection");
	}
}
public class Home {
private Network net=new LanNetwork();
public void net() {
	net.getConnection();
}
	public static void main(String[] args) {
		Home h=new Home();
		h.net();

	}

}
