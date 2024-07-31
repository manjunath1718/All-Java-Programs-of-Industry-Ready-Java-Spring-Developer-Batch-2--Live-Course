import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in first Servelet");

		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServelet");

		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		reqDispatch.forward(request, response);



		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response from Servelet One</h1>");
		writer.close();
		System.out.println("Control Again in first Servelet");
	}

}
