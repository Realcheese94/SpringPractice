package practice2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Applicationconfig {
	
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("soccer");
		hobbys.add("baseball");
		Student student = new Student("김길동");
		student.setAge(32);
		student.setHobbys(hobbys);
						
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("swimming");
		hobbys.add("book");
		Student student = new Student("유성재");
		student.setAge(5);
		student.setHobbys(hobbys);
						
		return student;
	}
	}


