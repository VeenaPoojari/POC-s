package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RequestLoggingFilter implements Filter{

	private FilterConfig config;
    private Logger log;
    
	@Override
	public void destroy() {
		/*
	     * called before the Filter instance is removed from service by the web
	     * container
	     */
	    log = null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = null;
	    long startTime;
	    long endTime;
	    String id = config.getInitParameter("log-id");

	    if (id == null)
	      id = "unknown";

	    if (log != null && (request instanceof HttpServletRequest)) {
	    	
	      req = (HttpServletRequest) request;
	      startTime = System.currentTimeMillis();
	       chain.doFilter(request, response);
	       endTime = System.currentTimeMillis();
	      log.info("Log id:" + id + ": Request received from: "
	          +System.currentTimeMillis()+ " for " + req.getRequestURL());
	      
	    //Log the servlet path and time taken
	      
	       
	       log.info("Log id:" + id + ": Request END: "
	    	          +(endTime - startTime)  + " for " + req.getRequestURL());
	    }
	    else
	    	chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
        //load the configuration for this application's loggers using the
        // servletLog.properties file
        PropertyConfigurator.configure(config.getServletContext().getRealPath("/")+ "/WEB-INF/log.properties");
        log = Logger.getLogger(RequestLoggingFilter.class);
        log.info("Logger instantiated in " + getClass().getName());this.config = filterConfig;
        //load the configuration for this application's loggers using the
        // servletLog.properties file
        PropertyConfigurator.configure(config.getServletContext().getRealPath("/")+ "/WEB-INF/log.properties");
        log = Logger.getLogger(RequestLoggingFilter.class);
        log.info("Logger instantiated in " + getClass().getName());
	}

}
