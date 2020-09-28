package Servlet.Base.ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02Config extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletConfig().getServletContext();
		String name = getServletConfig().getServletName();
		PrintWriter writer = resp.getWriter();
		writer.write(context.toString());
		writer.write("\n");
		writer.write(name);
	}

}
