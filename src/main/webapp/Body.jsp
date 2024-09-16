<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="com.food.RestaurantDAO,java.util.ArrayList,com.food.RestaurantDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Body.css">
</head>
<body>
<div>
	<%
	ArrayList<RestaurantDTO> ResList = RestaurantDAO.getList();
	%>
	<div id="body">
		<%
		for(RestaurantDTO res: ResList){
			String ResImage="https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/"+res.getImage();
			int res_id = res.getRes_id();
		%>
		<a href="FoodItems.jsp?ID=<%= res.getRes_id() %>">
		<div id="RestaurantCard">
			<img alt="Restaurant Image" src="<%= ResImage %>">
			<h3>Rating: <%= res.getAvg_rating() %></h3>
			<p><%= res.getCuisines_list() %></p>
		</div>
		</a>
		<%
		}
		%>	
	</div>
	</div>
</body>
</html>