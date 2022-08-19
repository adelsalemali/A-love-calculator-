package com.adel.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer
{
	
	public void onStartup(ServletContext servletContext) throws ServletException {
	
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalcaltorAppConfig.class);
		
		//Register dispatcher servlet with 
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);	
	    ServletRegistration.Dynamic dynamic = servletContext.addServlet("front-dad-dispatcherServlet", dispatcherServlet);
	    dynamic.setLoadOnStartup(1);
	    dynamic.addMapping("/noon.com/*");
	}
}
