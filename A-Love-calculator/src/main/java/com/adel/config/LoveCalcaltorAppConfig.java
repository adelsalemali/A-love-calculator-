package com.adel.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import come.adel.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.adel")
public class LoveCalcaltorAppConfig  implements WebMvcConfigurer{
	 
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver ;
	}
	
	@Bean
	public JavaMailSender getJavaMailSender()
	{
		JavaMailSenderImpl impl = new JavaMailSenderImpl();
		impl.setHost("smtp.gmail.com");
		impl.setUsername("m.q.b2050@gmail.com");
		impl.setPassword("adel156651");
		impl.setPort(587);
		
		Properties properties = new Properties();
		properties.put("mail.smptp.starttls.enable", true);
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		impl.setJavaMailProperties(properties);
		return impl ;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("insde addFormatters method");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	
//	@Override
//	public Validator getValidator() {
//	
//		return volidator();
//	}

}
