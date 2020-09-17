package Servlet.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 将Filter2和Filter1同时过滤相同的地址;因为Filter1先写Name,后写Mapping,所以先输出Filter2,在输出Filter1;
 * 如果都不写chain.doFilter()则只输出Filter2;
 * @author ZSP
 *
 */
public class Test01Filter1 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter1");
		chain.doFilter(request, response);
	}

}
