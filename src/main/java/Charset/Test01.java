package Charset;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servlet>>>JSP
 * @author ZSP
 *
 */
public class Test01 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("charset", "你好"+"<br />");
		RequestDispatcher rd = req.getRequestDispatcher("/Charset/test1.jsp");
		rd.forward(req, resp);
	}
}
