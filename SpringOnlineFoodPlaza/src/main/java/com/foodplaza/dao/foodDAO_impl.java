package com.foodplaza.dao;
import java.util.List;
import com.foodplaza.pojo.Food;

public interface foodDAO_impl {
	boolean addFood(Food food);
	boolean updateFoodById(Food food);
	boolean deleteFoodById(int foodid);
	List<Food>getAllFood();
	Food searchFoodById(int foodId);

}