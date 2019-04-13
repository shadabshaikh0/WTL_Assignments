import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Second extends HttpServlet {

	protected void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		String name = req.getParameter("name");
		double income = Double.parseDouble( req.getParameter("income") );
		
		out.print("<br> Income2 :"+ income  );
		out.print("<br> Name2 :"+ name  );
		
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req, resp);
	}
	
}

