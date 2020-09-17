package Servlet.Cache.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test01AddSession extends HttpServlet {

	private static final long serialVersionUID = 5283540638151931467L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(15);
		
		Integer count = (Integer)session.getAttribute("count");

		if (count == null) {
			session.setAttribute("count", 1);
			writer.write("第" + 1 + "次访问");
		} else {
			count=count+1;
			session.setAttribute("count", count);
			writer.write("第" + count + "次访问");
		}
	}

}
