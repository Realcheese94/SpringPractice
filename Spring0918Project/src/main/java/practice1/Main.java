package practice1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	String configLocation ="classpath:ApplicationCTX.xml";
	AbstractApplicationContext aac = new GenericXmlApplicationContext(configLocation);
	Icecream icecream =aac.getBean("ice1",Icecream.class);
	icecream.talkname();
	
	Icecream icecream2 = aac.getBean("ice2",Icecream.class);
	icecream2.talkname();
	icecream2.tasteice();
	
	IcecreamInfo icecreamInfo = aac.getBean("iceinfo",IcecreamInfo.class);
	icecreamInfo.getinfo();
}
}
