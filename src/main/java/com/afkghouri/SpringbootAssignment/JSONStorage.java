package com.afkghouri.SpringbootAssignment;

import java.io.FileWriter;
import java.lang.reflect.Field;

import org.json.JSONObject;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jsonobj")
@Primary
public class JSONStorage implements Storage{

	public void save(Object object) {
		try { 
			Class<? extends Object> aClass = object.getClass();
	        Field fields[] = aClass.getFields();
	        JSONObject jsonobj = new JSONObject();
	        for(Field field:fields) { 
		        System.out.println(field.getName()+" "+field.get(object));  
		        jsonobj.put(field.getName(),field.get(object));
	        }
	         
	        FileWriter file = new FileWriter("json.txt");
		    file.write(jsonobj.toString()); 
		    file.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
