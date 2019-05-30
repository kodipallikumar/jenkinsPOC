/**
 * 
 */
package com.demo.jenkins.jenkinsPOC;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kishore.kodipalli
 *
 */
@RestController
public class JenkinsController {
	
	@RequestMapping("/hello")
	String getJenkinsDetails() {
		
		System.out.println("Welcome to jenkins Family on: "+new Date());
		
		return "Welcome to jenkins Family on " + new Date();
	}

}
