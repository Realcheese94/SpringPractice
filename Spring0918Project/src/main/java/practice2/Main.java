package practice2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Applicationconfig.class);
		Student student = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
	
		System.out.println(student.getAge());
		System.out.println(student2.getAge());
		System.out.println(student.getHobbys());
		ctx.close();
	}
}
