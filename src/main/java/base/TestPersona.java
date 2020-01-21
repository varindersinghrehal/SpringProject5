package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersona {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Persona p1, p2;
		p1 = (Persona) context.getBean("persona1");
		System.out.println(p1);
		p2 = (Persona) context.getBean("persona2");
		System.out.println(p2);

	}

}
