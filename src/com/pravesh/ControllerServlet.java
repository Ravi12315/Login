package com.pravesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		//out.print(request.getParameter("uname"));
	
		MyBean bean = new MyBean();
		bean.setUname(request.getParameter("uname"));
		bean.setPassword(request.getParameter("password"));
		
		if(bean.validate()) {
			RequestDispatcher rd = request.getRequestDispatcher("/login-succes.jsp");
			rd.forward(request, response);
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/login-fail.jsp");
			rd.forward(request, response);
		}
	}

}
