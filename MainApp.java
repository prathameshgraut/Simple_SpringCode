package MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring_Demo.Employee;
import Spring_Demo.Student;

public class MainApp {

	public static void main(String[] args) {
		String Config_loc = "/config_XML/Config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(Config_loc);
		
		System.out.println("-------|| Show All Data In Spring Through ||-------");   //my suggestion 
		
		Student std = (Student) ctx.getBean("stdId");
		std.Display();
		
		Student std1 = (Student) ctx.getBean("stdId2");
		std1.Display();
		
		
		System.out.println("------|| Employee Data ||------");
		Employee emp =(Employee)ctx.getBean("Emp");
		emp.Display();
	}

}
