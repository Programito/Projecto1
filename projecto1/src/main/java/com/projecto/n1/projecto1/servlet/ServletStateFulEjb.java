package com.projecto.n1.projecto1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projecto.n1.projecto1.business.Servicios;
import com.projecto.n1.projecto1.domain.Baraja;
import com.projecto.n1.projecto1.domain.Carta;


@WebServlet(name="TallerForm2", urlPatterns={"/form2"})
public class ServletStateFulEjb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String STATEFUL_CLICK_BEAN_KEY = "click_bean"; 
	

	

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		 Servicios servicios = getStatefulServicio(request);		
		 int column = getSelectParameter(request.getParameter("selecc")); 		  
	
		  
		if(servicios.getTurno()==0){
			  servicios.inicializar();
		  }else if(column>0 && servicios.getTurno()>0 && servicios.getTurno()<=3){					  
			  servicios.avanzar(column);			  
		  }else if(column>0 && servicios.getTurno()==4){			
			  servicios.introducir(column);			
		  }
		
		  String salida="";
		  
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();  

		 out.println("<html>"); 
		 out.println("<head>");
		 out.println("<title> Adivinador de cartas</title>");
		 out.println("</head>");

		 out.println("<body>");
		 out.println("<h1> Adivinador de cartas </h1>");
		    	 
		 
		
		 salida=servicios.getImagenColumna(0);
		 out.println("<h2> Pack 1 </h2>");
		 out.println("<h2>" + salida + "</h2>");
		 salida=servicios.getImagenColumna(1);
		 out.println("<h2> Pack 2 </h2>");
		 out.println("<h2>" + salida + "</h2>");
		 salida=servicios.getImagenColumna(2);
		 out.println("<h2> Pack 3 </h2>");
		 out.println("<h2>" + salida + "</h2>");
		 
		
		    
		 out.println("<form action='/projecto1/form2' method='post'>");
		 
		 //out.println("<h3>turno:" + servicios.getTurno() + "</h3>");
		 if(servicios.getTurno()<=3){
			 out.println("<select name='selecc' id='selecc'>");
			 out.println("<option value='0'>Seleccione una columna </option>");
			 out.println("<option value='1'>Pack 1</option>");
			 out.println("<option value='2'>Pack 2</option>");
			 out.println("<option value='3'>Pack 3</option>");
			 out.println("</select>");
			   
			 out.println("<input type='submit' value='Enviar Pack'>");
			 out.println("</form>");
			 	
		 } else if(servicios.getTurno()==4){
			 out.println("<h1> Carta Solucion: "+ servicios.finalizar().getImagen() +"</h1>"); 
			 out.println("<input type='submit' value='Volver'>");
			 out.println("</form>");
		 }
		     

		 out.println("</body>");

		 out.println("</html>");

	
	
	}
	
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
	

	private  Servicios getStatefulServicio(HttpServletRequest request)
	         throws ServletException {
		
	     HttpSession httpSession = request.getSession(true);
	     Servicios statefulTestBean = 
	             (Servicios) httpSession.getAttribute(STATEFUL_CLICK_BEAN_KEY);
	     
	     
	     if (statefulTestBean == null) {
	         try {
	        	 
	             InitialContext ic = new InitialContext();
	             statefulTestBean =   (Servicios) ic.lookup("java:module/Servicios");
	             httpSession.setAttribute(STATEFUL_CLICK_BEAN_KEY, statefulTestBean);	          	       
	         } catch (NamingException e) {
	             throw new ServletException(e);
	         }
	     }
	     return statefulTestBean;
	 }
	
	
	private int getSelectParameter(String parameter) {
		int number=0; 
		if(parameter==null)
			return 0; 
		
		try{
			number = Integer.valueOf(parameter); 
		}catch(Exception e){
			
		}		
		return number;
	}
	
	

}
