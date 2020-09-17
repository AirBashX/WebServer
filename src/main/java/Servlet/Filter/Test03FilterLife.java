package Servlet.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * Filter的声明周期
 * @author ZSP
 *
 */
public class Test03FilterLife implements Filter{
	String life;
	static {
		System.out.println("加载");
	}
	
	//启动tomcat时执行;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化");
		life = filterConfig.getInitParameter("life");
		System.out.println(life);
	}
	
	//过滤时执行
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("就绪");
	}

	//不关闭tomcat,从tomcat中移除时执行;
	@Override
	public void destroy() {
		System.out.println("摧毁");
	}

}
