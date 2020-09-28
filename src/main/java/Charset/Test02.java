package Charset;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//不写这个传入的数据会乱码
		req.setCharacterEncoding("UTF-8");
		//不写,页面乱码
		resp.setContentType("text/html;charset=UTF-8");
		//不写,页面不乱码
		resp.setCharacterEncoding("UTF-8");
		String text = req.getParameter("text");
		System.out.println(text);
		PrintWriter writer = resp.getWriter();
		writer.write(text);
	}
}
