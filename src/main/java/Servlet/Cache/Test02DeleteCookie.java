package Servlet.Cache;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02DeleteCookie extends HttpServlet{
	
	private static final long serialVersionUID = -522155308127922906L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getContextPath();
		System.out.println(path);
		Cookie cookie = new Cookie("count", null);
		cookie.setMaxAge(0);
		cookie.setPath(path);
		resp.addCookie(cookie);
	}
}
