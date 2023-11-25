package com.foodplaza.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.foodplaza.pojo.Food;


public class Fooddao implements foodDAO_impl {
	private JdbcTemplate templaet;
	
	public JdbcTemplate getTemplaet() {
		return templaet;
	}
	public void setTemplaet(JdbcTemplate templaet) {
		this.templaet = templaet;
	}
	
	
	
	@Override
	public boolean addFood(Food food) {
		String sql= "Insert into Foodag(fname,ftype,fcategory,price) values(?,?,?,?)";
		int row=templaet.update(sql,food.getFoodname(),food.getFoodtype(),food.getFoodcategory(),food.getPrice());
		return row>0;
	}
	@Override
	public boolean updateFoodById(Food food) {
		String sql="Update  Foodag set fName=?, ftype=?, fCategory=?,price=? where fId=?";
		int row=templaet.update(sql,food.getFoodname(),food.getFoodtype(),food.getFoodcategory(),food.getPrice(),food.getFoodid());
		return row>0;
	}
	@Override
	public boolean deleteFoodById(int foodid) {
		String sql="Delete from Foodag where fid=?";
		int row=templaet.update(sql,foodid);
		return row>0;
	}
	@Override
	public List<Food> getAllFood() {
		String sql="select * from Foodag";
		List<Food> foodlist= templaet.query(sql, new RowMapper<Food>(){
			
			@Override
			public Food mapRow(ResultSet rs, int row) throws SQLException{
				Food food= new Food();
				food.setFoodid(rs.getInt("fid"));
				food.setFoodname(rs.getString("fname"));
				food.setFoodtype(rs.getString("ftype"));
				food.setFoodcategory(rs.getString("fcategory"));
				food.setPrice(rs.getDouble("price"));
				
				return food;
			}
			
		});
		
		
		return foodlist;
	}
	@Override
	public Food searchFoodById(int foodId) {
		String sql="select * from Foodag where fid=?";
		Food food=null;
		return food= templaet.queryForObject(sql,new Object[] {foodId}, new RowMapper<Food>(){
			
				@Override
				public Food mapRow(ResultSet rs, int row) throws SQLException{
					Food food= new Food();
					food.setFoodid(rs.getInt("fid"));
					food.setFoodname(rs.getString("fname"));
					food.setFoodtype(rs.getString("ftype"));
					food.setFoodcategory(rs.getString("fcategory"));
					food.setPrice(rs.getDouble("price"));
					
					return food;
				}
				
			});
			
	}

}