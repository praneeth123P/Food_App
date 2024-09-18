package com.food;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RestaurantRegistrationServlet
 */
public class RestaurantRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantRegistrationServlet() {
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
		int ResID=Integer.parseInt(request.getParameter("ResID"));
		String ResName=request.getParameter("ResName");
		String ResAddress=request.getParameter("ResAddress");
		String ResLocation=request.getParameter("ResLocation");
		String ResOpen=request.getParameter("ResOpen");
		String ResClose=request.getParameter("ResClose");
		int ResGSTNum=Integer.parseInt(request.getParameter("ResGSTNum"));
		String ResCuisinsList=request.getParameter("ResCuisinsList");
		double ResContactNum=Integer.parseInt(request.getParameter("ResContactNum"));
		double ResBankAccNum=Integer.parseInt(request.getParameter("ResBankAccNum"));
		String ResEmail=request.getParameter("ResEmail");
		String ResPassword=request.getParameter("ResPassword");
		double ResAvgRating= Float.parseFloat(request.getParameter("ResAvgRating"));
		String ResOrderAccept=request.getParameter("ResOrderAccept");
		String ResImageURL=request.getParameter("ResImageURL");
		PrintWriter pw= response.getWriter();
		int Success=RestaurantDAO.setRestaurantList(ResID, ResName, ResAddress, ResLocation, ResOpen, ResClose, ResGSTNum, ResCuisinsList, ResContactNum, ResBankAccNum, ResEmail, ResPassword, ResAvgRating, ResOrderAccept, ResImageURL);
		
		if(Success>0) {
			pw.println("<h1>Successfully Registered</h1>");
		}
		else {
			pw.println("<h1>Failed to Registered</h1><br><h4>Please Try Again</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("RestaurantRegistration.jsp");
			rd.include(request, response);
			
		}
	}

}
