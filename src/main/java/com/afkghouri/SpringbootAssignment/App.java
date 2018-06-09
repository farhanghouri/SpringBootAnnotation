package com.afkghouri.SpringbootAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	 //  @Autowired
	   // Shape shape;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(App.class, args);
        Demo demo = configurableApplicationContext.getBean(Demo.class);
        demo.draw();
         
    }
}
