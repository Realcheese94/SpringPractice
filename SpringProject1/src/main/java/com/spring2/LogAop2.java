package com.spring2;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop2 {
	
	public Object loggerAop2(ProceedingJoinPoint joinpoint) throws Throwable {
		try {
			Object obj2 = joinpoint.proceed();
			System.out.println("시작");
			return obj2;
		}finally {
			System.out.println("프로그램이 종료");
		}
	}
	public void loggerAop3(ProceedingJoinPoint joinpoint) {
	System.out.println("hi");
	}


}
