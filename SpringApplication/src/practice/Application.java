package practice;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication 
//is a convenience annotation that adds all of the following
//@configuration- tags the class as a source of bean definitions for the application context
//@EnableAutoConfiguration tells Spring Boot to start adding beans based on class path settings, other beans, and various property settings
//
//Normally you would add @EnableWebMvc for a Spring MVC app, 
//but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. 
//This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet
//@ComponentScan tells Spring to look for other components, configurations and services in the springBoot package, allowing it to find the controllers
public class Application {
	
	private static final Logger logger = Logger.getLogger(Application.class);
	
	
//	public static void main(String [] args){
//		SpringApplication.run(Application.class, args);
//	}
//	
//	@Bean 
//	//the @Bean annotation retrieves all the beans created by the application or automatically added!!!
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("lets inspect the bean");
//			
//			String [] beans = ctx.getBeanDefinitionNames();
//			
//			Arrays.sort(beans);
//			for (String bean :beans) {
//				logger.info("logging the beans");
//				System.out.println(beans.toString());
//	
//			}
//		};
//	}
}
