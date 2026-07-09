package com.library.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
/**
 * @author ivek5
 **/

//Aspect class used for Logging execution time of methods.
public class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        System.out.println("----------------------------------------");
        System.out.println("Method Executed : " + joinPoint.getSignature().getName());
        System.out.println("Execution Time  : " + (endTime - startTime) + " ms");
        System.out.println("----------------------------------------");

        return result;
    }
}
