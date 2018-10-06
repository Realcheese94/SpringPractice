package com.spring2;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint)throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr +"is start");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		}
		finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr +"is finished");
			System.out.println("경과시간은"+(et-st));
		}
		
		
	}

}
