package com.afkghouri.SpringbootAssignment;
 
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
 
import org.springframework.stereotype.Component;
 

@Component("xmlobj")
public class XMLStorage implements Storage{

	public void save(Object object) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("xml.xml"));
			XMLEncoder encoder = new XMLEncoder(fos);
			encoder.writeObject(object);
			encoder.close(); 
			fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
