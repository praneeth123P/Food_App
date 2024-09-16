package com.food;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FoodItemsDAO 
{
	public static ArrayList<FoodItemsDTO> getList(){
		ArrayList<FoodItemsDTO> res= new ArrayList<>();
		try {
		Connection con = Jdbc.getCon();
		PreparedStatement stmt = con.prepareStatement("select * from food_items");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			FoodItemsDTO list = new FoodItemsDTO(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),
					rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getString(9));
			res.add(list);
		}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return res;

}
}
