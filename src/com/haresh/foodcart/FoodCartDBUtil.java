package com.haresh.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/food";
    public static final String USER_NAME = "**";
    public static final String PASSWORD = "*********";
    
	public static List<Food> getFoodItems() throws ClassNotFoundException, SQLException {
		List<Food> foods = new ArrayList<>();
		
		// load the mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// get the connection
		Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
		
		// create the statement
		Statement st = con.createStatement();
		
		// fire the query
		
		ResultSet rs = st.executeQuery("select * from food.foodcart");
		
		while(rs.next()) {
			int i = rs.getInt(1);
			String n = rs.getString(2);
			int p = rs.getInt(3);
			Food food = new Food(i,n,p);
			foods.add(food);
		}
	
		return foods;
	}

}
