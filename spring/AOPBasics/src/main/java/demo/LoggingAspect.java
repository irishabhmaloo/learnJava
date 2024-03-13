package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp) {
        System.out.println(jp.getSignature());

        String arg = jp.getArgs()[0].toString();
        System.out.println("Loggers with argument: " + arg);
    }
}
