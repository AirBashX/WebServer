package Servlet.Cache.ServletContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01ServletContext extends HttpServlet{

	private static final long serialVersionUID = -4784304402576428707L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		ServletContext sc1 = req.getServletContext();
		ServletContext sc2 = getServletContext();

		//获取的是同一个对象
		System.out.println("sc1和sc2是否为同一个对象:"+(sc1==sc2));
		
		Object value = sc1.getAttribute("count");
		if(value!=null) {
			Integer count=Integer.valueOf(value+"")+1;
			sc1.setAttribute("count", count);
			writer.write("一共访问"+count+"次");
		}else {
			sc1.setAttribute("count", 1);
			writer.write("一共访问1次");
		}
	}
	
}
