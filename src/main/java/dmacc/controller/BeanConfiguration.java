/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Mar 19, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.House;

@Configuration
public class BeanConfiguration {
	@Bean
	public House house() {
		House bean = new House("221 N View Ave", "Des Moines", "IA", 50321, 500000.00);
		return bean;
	}
}
