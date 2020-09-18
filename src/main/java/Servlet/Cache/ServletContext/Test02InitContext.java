package Servlet.Cache.ServletContext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02InitContext extends HttpServlet{

	private static final long serialVersionUID = -5876723517915918052L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		System.out.println(name);
	}
}
