import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServeletApp")
public class ServeletApp extends HttpServlet {
	
  /*
   * if we use doGet method we can able see data on URL
   */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("control in Servelet");
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		if(name.equalsIgnoreCase("rohit") && city.equalsIgnoreCase("mumbai")) {
			System.out.println("Success! Right rohit is logged in");
			PrintWriter writer = response.getWriter();
			writer.println("Success! Right rohit is logged in");
		}
		else {
			System.out.println("Diff Rohit logged in");
			PrintWriter writer = response.getWriter();
			writer.println("Diff Rohit logged in");
		}
	}

	

}
