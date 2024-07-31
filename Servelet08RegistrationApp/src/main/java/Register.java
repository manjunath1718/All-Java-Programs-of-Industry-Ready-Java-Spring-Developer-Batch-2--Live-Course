import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in Servlet");
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("ucity");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/t_db", "root","root");

			PreparedStatement pStmt = con.prepareStatement("INSERT into servelet_personalinfo(uname, email, password, city)"+
			"values(?,?,?,?)");
			pStmt.setString(1, name);
			pStmt.setString(2, email);
			pStmt.setString(3, password);
			pStmt.setString(4, city);
			
			
			int rowsAffected = pStmt.executeUpdate();
			
			PrintWriter writer = response.getWriter();
			if(rowsAffected!=0) {
				writer.println("<h1>Registration Success!</h1>");
			}
			else
			{
				writer.println("<h1>Registration fail!</h1>");
			}
			pStmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
