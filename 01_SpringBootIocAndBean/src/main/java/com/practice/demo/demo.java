package com.practice.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//1st class, which is associated with base package
@Component
@Scope("prototype")
public class demo {

	public String hello() {
		String name = "Shilpa";
		return "This is " + name + ", welcome you all";
	}
}
