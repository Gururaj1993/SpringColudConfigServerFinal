package com.example.config.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.limitsservice.beans.LimitConfiguration;

@RestController
@RefreshScope
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(value = "/")
	public String test() {
		System.out.println("-----------------------------");
		return "Hello";
	}
	
	@GetMapping(value="/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration()
	{
	return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

	
	

}
