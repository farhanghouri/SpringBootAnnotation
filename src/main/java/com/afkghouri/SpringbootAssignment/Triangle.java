package com.afkghouri.SpringbootAssignment;

import org.springframework.stereotype.Component;

@Component("mytriangle")
public class Triangle implements Shape{

	public void draw() {
  	  System.out.println("Triangle drawing");
		
	}

}
