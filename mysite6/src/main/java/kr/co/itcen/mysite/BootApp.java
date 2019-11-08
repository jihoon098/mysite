package kr.co.itcen.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication어노테이션 :
 * 
 * 	1. @SpringBootConfiguration, 
 *  2. @EnableAutoConfiguration, 
 *  3. @ComponentScan("kr.co.itcen.mysite.controller")
 * 	위 3가지의 어노테이션을 한꺼번에 처리하는 어노테이션이다.
 * 
 */

@SpringBootApplication
public class BootApp {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}
	
}
