import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TaxCalculator extends HttpServlet {

	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		String name = req.getParameter("name");
		double income = Double.parseDouble(req.getParameter("income"));

		double tax = 0;
		if( income < 200 ){
			tax = 0;
		}
		else if( income > 200 && income < 400  ){
			tax = income * 0.10;
		}
		else{
			tax = income * 0.20;
		}
		
		out.print("<br> Income :"+ income  );
		out.print("<br> Tax :"+ tax  );
		out.print("<br> Total :"+ income + tax  );
		
		out.print("</body>");
		out.print("</html>");
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processRequest(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processRequest(req, resp);
	}
	
}

