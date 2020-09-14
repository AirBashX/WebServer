package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test05Cookie extends HttpServlet{

	private static final long serialVersionUID = 938938586753700577L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		Cookie[] cookies = req.getCookies();
		
		Cookie cookie=null;
		for(Cookie cookie2 : cookies) {
			if(cookie2.getName().equals("cookie")) {
				cookie=cookie2;
			}
		}
		
		/**
		 * 是否本来就存在cookie1,yes:不存在;no:存在
		 */
		if(cookie==null) {
			cookie = new Cookie("cookie", "1");
			//设置Cookie的存活时间
			cookie.setMaxAge(60*60);// 1小时
			//向用户发送Cookie
			resp.getWriter().write("您是第1次访问");
		}else {
			String value = cookie.getValue();
			Integer count = Integer.valueOf(value);
			count=count+1;
			cookie.setValue(count+"");
			resp.getWriter().write("您是第"+count+"次访问");
		}
		resp.addCookie(cookie);
	}
}