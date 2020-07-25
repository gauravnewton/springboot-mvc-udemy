package com.techreloded.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringBootUdemyApplication.
 */
@SpringBootApplication
public class SpringBootUdemyApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringBootUdemyApplication.class, args);

		Aliean obj = ctx.getBean(Aliean.class);
		obj.code();

	}

}
