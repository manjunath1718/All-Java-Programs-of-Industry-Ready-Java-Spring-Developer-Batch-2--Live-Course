import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServelet")
public class FirstServeletApp extends jakarta.servlet.http.HttpServlet {

	public FirstServeletApp() {
		System.out.println("Servelet obj is created internally by container");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");

		PrintWriter writer = response.getWriter();
		//		writer.println("Hi "+name);
		//		writer.println("I know you're from  "+city);

		writer.println("<html> <head> <title> Second App</title></head>");
		writer.println("<body bgcolor='cyan'> <h1><marquee> Welcome to our dynamic app </marquee></h1>");
		writer.println("<table>");
		writer.println("<tr> <th>NAME</th>  <th>CITY</th> </tr>");
		writer.println("<tr><td> "+name+"</td> <td> "+city+"</td> </tr>");

		writer.println("</table></body>");

		writer.println("</html>");

		writer.close();

	}

}
