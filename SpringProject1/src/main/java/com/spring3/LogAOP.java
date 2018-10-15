package com.spring3;

import java.io.IOException;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAOP {

	
	@Pointcut("within(com.spring3.*)")
	private void pointcutMethod() {		
	}
	
	@Around("pointcutMethod()")
	public Object LogAOP(ProceedingJoinPoint joinPoint) throws Throwable
	{
		
			String signature = joinPoint.getSignature().toShortString(); 
			System.out.println(signature+"is start");
			long st = System.currentTimeMillis();
			try {
				Object obj = joinPoint.proceed();
				return obj;
		
		}
			finally {
				long et = System.currentTimeMillis();
				System.out.println("경과 시간은 "+(et-st));
				System.out.println("하나 종료");
				
			}
			
		
	}
	
	
	@Before("within(com.spring3.*)")
	public void BeforAdvice() {
		System.out.println("beforadvice");
	}
	
}


