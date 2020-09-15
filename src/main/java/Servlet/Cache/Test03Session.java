package Servlet.Cache;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test03Session extends HttpServlet{

	private static final long serialVersionUID = 5283540638151931467L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(15);
		session.setAttribute("count", 1);
	}
	
}
