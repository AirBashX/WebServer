package JSP;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试el表达式获取内容的顺序
 */
public class Test02Scope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().setAttribute("name", "application");
		request.getSession().setAttribute("name", "session");
		request.setAttribute("name", "request");
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/Scope.jsp");
		rd.forward(request, response);
	}
}
