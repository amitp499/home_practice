package com.jp.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ProductFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "*.do" })
public class ProductFilter implements Filter {

   

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/head.jsp");
		dispatch.include(request, response);
		
		chain.doFilter(request, response);
		
		RequestDispatcher dispatch1 = request.getRequestDispatcher("/WEB-INF/jsps/foot.jsp");
		dispatch1.include(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
