

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleLogin
 */
@WebServlet("/Simplelogin")
public class SimpleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SimpleLogin() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        PrintWriter writer = response.getWriter();
	        writer.println("<html>");

	        if(username.equals("admin") && password.equals("admin")) {
	            writer.println("<h1>Welcome "+username+" to website</h1>");
	        } else{
	            writer.println("<h1>Login Error</h1>");
	        }
	        writer.println("</html>");	
	        
	        }
}
