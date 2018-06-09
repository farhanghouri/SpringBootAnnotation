package com.afkghouri.SpringbootAssignment;

 
import org.springframework.stereotype.Component;

@Component("mycircle")  
public class Circle implements Shape{
 
	 public void draw() {

  	  System.out.println("circle drawing");
		
	}
	   
	  
      
}
