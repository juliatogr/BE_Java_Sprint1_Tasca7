package n2exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

@JsonDir(dir = "src/n2exercici1/person.json")
public class N2_E1_main {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, IOException, ClassNotFoundException{
		
		System.out.println("****Instantiated person****");

		Person person = new Person("Marta", "Espiga", 30);
		System.out.println(person);
		System.out.println();
		
		System.out.println("Serializing & deserializing the person...");
		
		Annotation annotation = N2_E1_main.class.getDeclaredAnnotation(JsonDir.class);
		String dir = (String) annotation.annotationType().getDeclaredMethods()[0].invoke(annotation);

	    FileOutputStream fileOutputStream = new FileOutputStream(dir);
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(person);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    FileInputStream fileInputStream = new FileInputStream(dir);
	    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	    
	    System.out.println();
	    
	    System.out.println("****Deserialized person****");
	    Person p2 = (Person) objectInputStream.readObject();
	    System.out.println(p2);
	    objectInputStream.close();
	    
	    

	}
		
}
