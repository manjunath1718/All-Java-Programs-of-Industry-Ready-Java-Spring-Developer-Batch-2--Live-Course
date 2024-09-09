package com.telusko.aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ImplementerAOP {

//	@Before(value="execution(* com.telusko.rest.*.*(..))")
	@Before(value="execution(* com.telusko.rest.ImplementerController.*(..))")
	public void  beforeAdvice(JoinPoint joinPoint){
		
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@After(value ="execution(* com.telusko.rest.ImplementerController.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		
		System.out.println("Response came from "+joinPoint.getSignature()+" at "+LocalTime.now());
		
	}
	
	@Before(value="execution(* com.telusko.service.ImplementerService.*(..))")
	public void  beforeServiceAdvice(JoinPoint joinPoint){
		
		System.out.println("Request made to "+ joinPoint.getSignature() +" at "+LocalTime.now());
	}
	
	@After(value ="execution(* com.telusko.service.ImplementerService.*(..))")
	public void afterServiceAdvice(JoinPoint joinPoint) {
		
		System.out.println("Response came from "+joinPoint.getSignature()+" at "+LocalTime.now());
		
	}
	
	@AfterThrowing(value ="execution(* com.telusko.service.ImplementerService.*(..))",throwing = "exception")
	public void afterExcThrowAdvice(JoinPoint joinPoint,RuntimeException exception) {
		
		System.out.println("Response came from "+joinPoint.getSignature()+" at "+LocalTime.now()
		+" and exception is "+exception.getMessage());
		
	}
	
	
}
