import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServeletLife")
public class ServeletLife extends HttpServlet {

	static{
		System.out.println("servlet is loaded...");
	}
	public ServeletLife() {
		System.out.println("servelet Object is created");
	}


	public void init(ServletConfig config) throws ServletException {

		System.out.println("Servelet initialized!");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Service method to handle http request and response back");
	}

	public void destroy() {

	}
}
