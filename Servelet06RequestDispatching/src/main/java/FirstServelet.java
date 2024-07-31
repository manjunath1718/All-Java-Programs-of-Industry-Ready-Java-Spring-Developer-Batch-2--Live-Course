import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Control in first Servelet");
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServelet");
		
//		reqDispatch.forward(request, response);
		reqDispatch.include(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response from Servelet One</h1>");
		writer.close();
		System.out.println("Control Again in first Servelet");
	}

}
