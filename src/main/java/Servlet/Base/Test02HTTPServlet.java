package Servlet.Base;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02HTTPServlet extends HttpServlet{

	private static final long serialVersionUID = -6611086270624707266L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		String string = date.toString();
		PrintWriter pw = resp.getWriter();
		pw.write(string);
	}	
}
