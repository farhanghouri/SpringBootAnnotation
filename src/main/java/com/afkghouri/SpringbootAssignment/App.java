package com.afkghouri.SpringbootAssignment;
 
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext; 
 
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{ 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(App.class, args);
        Demo demo = configurableApplicationContext.getBean(Demo.class); 
        demo.save(new Student("farhan",123,786)); 
         
    }
}
