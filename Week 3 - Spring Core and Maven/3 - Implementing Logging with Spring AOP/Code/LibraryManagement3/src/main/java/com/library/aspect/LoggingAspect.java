package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	 	@Around("execution(* com.library.service.*.*(..))")
	    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	        String methodName = joinPoint.getSignature().toShortString();

	        System.out.println("[LOG] Starting method: " + methodName);

	        long start = System.currentTimeMillis();
	        Object result = joinPoint.proceed();
	        long end = System.currentTimeMillis();

	        System.out.println("[LOG] Finished method: " + methodName + " in " + (end - start) + " ms");

	        return result;
	    }
}
