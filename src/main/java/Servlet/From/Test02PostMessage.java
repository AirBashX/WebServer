package Servlet.From;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02PostMessage extends HttpServlet{

	private static final long serialVersionUID = -1146803916908089921L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		writer.write("账户是:"+username+"<p/>");
		writer.write("密码是:"+password+"<p/>");
		
		String select = req.getParameter("select");
		writer.write(select+"<p/>");
		
		String radio = req.getParameter("radio");
		writer.write(radio+"<p/>");
		
		String[] checkboxs = req.getParameterValues("checkbox");
		for(String checkbox:checkboxs) {
			writer.write(checkbox+"&npsp;");
		}
		
	}

}
