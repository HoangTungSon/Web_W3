
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Caculate
 */
@WebServlet("/Caculate")
public class Caculate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Caculate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String productName = request.getParameter("productDescription");
		double discountRate = Float.parseFloat(request.getParameter("discountRate"));
		double deposit = Float.parseFloat(request.getParameter("deposit"));
		
		double discountAmount = deposit*discountRate*0.01;
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<h1>Product description " + productName + "</h1>");
		writer.println("<h1>Discount rate = " + discountRate + "</h1>");
		writer.println("<h1>Deposit = " + deposit + "</h1>");
		writer.println("<h1>Discount Amount = " + discountAmount + "</h1>");
		writer.println("</html>");

	}

}
