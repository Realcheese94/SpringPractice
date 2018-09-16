package com.lec.spring1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		//configLocation의 주소를 잡아준다. xml파일이 있는곳
		String configLocation = "classpath:applicationCTX.xml";
		//추상 application context 를 xml 제네릭으로 만들어준다. xml 제네릭 소스경로를 통해서
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//Mycalculator 를 만들지만 ctxgetbean을 통해 my calculator를 만든다.
		//getbean의 첫번째 인자 는 bean id 가 되고 두번째 인자는 그것이 class라는것을 알려준다.
		MyCalculator myCalculator = ctx.getBean("MyCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.div();
		myCalculator.mul();
		
		
	}
}
