package Servlet.Base.ServletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01InitConfig extends HttpServlet{

	private static final long serialVersionUID = -4239887149836725078L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		System.out.println(name);
	}

}
