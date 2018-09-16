package pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String configLocation = "classpath:PencilapplicationCTX.xml";
		AbstractApplicationContext aac = new GenericXmlApplicationContext(configLocation);
		Pencil pencil = aac.getBean("pencil",Pencil.class);
		pencil.use();
		aac.close();
	}
}
