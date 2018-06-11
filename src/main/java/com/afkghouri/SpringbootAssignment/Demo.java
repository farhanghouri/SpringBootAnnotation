package com.afkghouri.SpringbootAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Autowired(required=false)
	//@Qualifier("xmlobj")
	Storage storage;
	   
	   void save(Object object){ 
		   storage.save(object);
	   }
}
