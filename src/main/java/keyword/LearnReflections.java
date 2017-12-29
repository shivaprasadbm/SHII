package keyword;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LearnReflections {

	@Test
	public LearnReflections() throws ClassNotFoundException {
		// TODO Auto-generated constructor stub
		
		
		
		// we are using <?> coz we dont know the return type
		Class<?> wrapper =  Class.forName("wrappers.GenericWrappers");
		//line no.16 returns collection/arrays
		Method[] methods=wrapper.getDeclaredMethods();
		
		//to display we use for each
		for (Method m : methods) {
			
			System.out.println("this is the method name= "+m.getName());
		}
		
		
		
		
		
	}
	
	 

}
