package com.foodplaza.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.foodplaza.dao.Fooddao;
import com.foodplaza.pojo.Food;



@Controller
public class FoodController {
	@Autowired
	Fooddao fdi;
//add food	
@RequestMapping("/showfoodform")//index page url
public ModelAndView displayFoodForm() {
	return new ModelAndView("AddFood","command",new Food());//will go to Addfood page
	
}
@RequestMapping(value="/food", method=RequestMethod.POST)//AddFood.jsp action page 
public String saveFood(@ModelAttribute Food food)//go to dao_impl page
{
	fdi.addFood(food);//search for add food on dao_impl page
	return "Success";//if successful execution redirect to success.jsp page
}
//update food
@RequestMapping("/Showupdatefoodform")
public ModelAndView displayUpdateFoodForm() {
	return new ModelAndView("UpdateFood","command",new Food());
}
@RequestMapping(value="/edit/updatefood", method=RequestMethod.POST)
public String updateFood(@ModelAttribute Food food){
	fdi.updateFoodById(food);
	return "Success";
}
//show list
@RequestMapping("/foodlist")
public ModelAndView showFoodList() {
	List<Food> foodlist=fdi.getAllFood();
	return new ModelAndView("FoodList","flist",foodlist);

}

@RequestMapping("/edit/{foodid}")
public ModelAndView editfood(@PathVariable int foodid) {
	Food food=fdi.searchFoodById(foodid);
	return new ModelAndView("UpdateFood","food",food);
}
//delete food
@RequestMapping(value="/delete/{foodid}")
public ModelAndView deletefood(@PathVariable int foodid) {
	fdi.deleteFoodById(foodid);
	return showFoodList();
	
}




























}


