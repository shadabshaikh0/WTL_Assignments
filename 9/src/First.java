import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class First extends HttpServlet {

	protected void process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		String name = req.getParameter("name");
		double income = Double.parseDouble( req.getParameter("income") );
		HttpSession session = req.getSession();
		session.setAttribute("name",name);
		
		out.print("<br> Income :"+ income  );
		out.print("<br> Name :"+ name  );
		
		req.getRequestDispatcher("Second").forward(req, res);
		
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

