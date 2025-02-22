package com.shubham.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.shubham.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " message execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish  = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @AfterThrowing(value = "execution(* com.shubham.services.*.*(..))", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of " +
                "@AfterThrowing which happened due to : " + exception.getMessage());
    }

    @AfterReturning(value = "execution(* com.shubham.services.*.*(..))", returning = "returnValue")
    public void logStatus(JoinPoint joinPoint, Object returnValue) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " Method successfully processed with the status " +
                returnValue.toString());
    }
}
