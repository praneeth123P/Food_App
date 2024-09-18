<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
<%@ include file="RestaurantRegistration.css" %>
</style>
</head>
<body>
<form action="RestaurantRegistrationServlet" method="post">
		<div id="RegPage">
			<h3>Restaurant Registration</h3>
			<table>
				<tr><td>Enter Restaurant ID:</td><td><input type="text" name="ResID"></td></tr>
				<tr><td>Enter Resturant_Name:</td><td><input type="text" name="ResName"></td></tr>
				<tr><td>Enter Resturant_Address:</td><td><input type="text" name="ResAddress"></td></tr>
				<tr><td>Enter Resturant_Location:</td><td><input type="text" name="ResLocation"></td></tr>
				<tr><td>Enter Open_time:</td><td><input type="text" name="ResOpen"></td></tr>
				<tr><td>Enter close_time:</td><td><input type="text" name="ResClose"></td></tr>
				<tr><td>Enter GST_Number:</td><td><input type="text" name="ResGSTNum"></td></tr>
				<tr><td>Enter Cuisins_List:</td><td><input type="text" name="ResCuisinsList"></td></tr>
				<tr><td>Enter Contact_Number:</td><td><input type="text" name="ResContactNum"></td></tr>
				<tr><td>Enter Bank_Account_number:</td><td><input type="text" name="ResBankAccNum"></td></tr>
				<tr><td>Enter Email:</td><td><input type="text" name="ResEmail"></td></tr>
				<tr><td>Enter Password:</td><td><input type="text" name="ResPassword"></td></tr>
				<tr><td>Enter Avg_rating:</td><td><input type="text" name="ResAvgRating"></td></tr>
				<tr><td>Enter Order_Accept_Status: </td><td><input type="text" name="ResOrderAccept"></td></tr>
				<tr><td>Enter Image:</td><td><input type="text" name="ResImageURL"></td></tr>
				<tr><td><input type="submit" value="Register"></td></tr>
			</table>
		</div>
	</form>

</body>
</html>