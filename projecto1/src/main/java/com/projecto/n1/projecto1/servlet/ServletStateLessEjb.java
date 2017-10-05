package com.projecto.n1.projecto1.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projecto.n1.projecto1.business.Greeting;





@WebServlet(name="TallerForm", urlPatterns={"/form1"})
public class ServletStateLessEjb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private Greeting greeting;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String tipo=request.getParameter("selecc");
		String radio=request.getParameter("radio");
		String altura=request.getParameter("altura");
		
		
		String message = greeting.getGreeting(tipo,radio,altura); 
		

		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Calculos Geometricos </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1> Calculos Geometricos  </h1>");
		out.println("<h3> Tipo: " + tipo  +"</h3>");
		if(tipo.equals("Cubo")){
			out.println("<h3> Lado: " + radio  +"</h3>");
		}else{
			out.println("<h3> Radio: " + radio  +"</h3>");
		}
		if(tipo.equals("Cilindro") || tipo.equals("Cono")){
			out.println("<h3> Altura: " + altura  +"</h3>");
		}
		out.println("---------------------------------------<br>");
		out.println("<h3>" + message  +"</h3>");
		out.println("<p><a href='./geometria.html'> Areas y Volumenes </a></p>"); 
		out.println("</body>");
		out.println("</html>");
	}

}
