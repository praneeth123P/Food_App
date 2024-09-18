package com.food;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class RestaurantLoginServlet
 */
public class RestaurantLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		try {
			
			Connection connection= Jdbc.getconnection();
			int Id= Integer.parseInt(request.getParameter("txtID"));
			String Pass=request.getParameter("txtPASS");
			PreparedStatement  stmt = connection.prepareStatement("select * from restaurant_owner where res_id=? and login_password=?");
			stmt.setInt(1, Id);
			stmt.setString(2, Pass);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
				rd.forward(request, response);
			}
			else {
				pw.println("<font colour=red size=18>Login Failed!!</font><br>");
				pw.println("<a href=RestaurantLogin.jsp> Try Again!!");
			}
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			pw.println(ex);
	}

}
}
