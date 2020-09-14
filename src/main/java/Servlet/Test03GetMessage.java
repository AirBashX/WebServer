package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 通过get方法接收信息,并发送到html文件上
 * @author ZSP
 *
 */
public class Test03GetMessage extends HttpServlet{
	
	private static final long serialVersionUID = 2239865831077865552L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("utf8");
		String parameter = req.getParameter("message");
		PrintWriter writer = resp.getWriter();
		writer.write(parameter);
	}
	
}
