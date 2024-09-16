package com.food;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RestaurantDAO 
{
	public static ArrayList<RestaurantDTO> getList(){
		ArrayList<RestaurantDTO> res= new ArrayList<>();
		try {
		Connection con = Jdbc.getCon();
		PreparedStatement stmt = con.prepareStatement("select * from restaurant_owner");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			RestaurantDTO list = new RestaurantDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getDouble(9), rs.getDouble(10), rs.getString(11), rs.getString(12), rs.getDouble(13), rs.getString(14),rs.getString(15));
			res.add(list);
		}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return res;
}
}
