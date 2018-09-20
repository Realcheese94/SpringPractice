package practice3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	ctx.load("classpath:StudentCTX.xml");
	Student student =ctx.getBean("student1",Student.class);
	ctx.refresh();
	ctx.close();	
	
	
}
}
