package com.DAO;
import java.util.List;

import com.pojo.FoodPojo;

public interface Fooddao {
		public boolean addFood(FoodPojo food);
		public boolean updateFoodById(FoodPojo food);
		public boolean  deleteFoodById(int foodid);
		List<FoodPojo>getAllFood();
		FoodPojo searchFoodById(int foodId);
}


