package com.pojo;

public class FoodPojo {
	private int foodid;
	private String foodname, foodtype,foodcategory;
	private double price;
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public String getFoodcategory() {
		return foodcategory;
	}
	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public FoodPojo(String foodname, String foodtype, String foodcategory, double price) {
		super();
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foodcategory = foodcategory;
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodPojo [foodid=" + foodid + ", foodname=" + foodname + ", foodtype=" + foodtype + ", foodcategory="
				+ foodcategory + ", price=" + price + "]";
	}
	public FoodPojo() {
		super();
	}
	
	

}
