

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("ucity");
		
		Model model=new Model();
		model.setName(name);
		model.setEmail(email);
		model.setPassword(password);
		model.setCity(city);
		
		int rowsAffected = model.register();
		
		HttpSession session = request.getSession();
		session.setAttribute("name",name );
		if(rowsAffected!=0) {
			response.sendRedirect("/Servelet10RegistrationMVC/success.jsp");
		}else {
			response.sendRedirect("/Servelet10RegistrationMVC/failure.jsp");
		}
	}

}
