package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    
    @Pointcut("within(demo..*)")
    // within which class you want to execute - here for all demo package class/methods
    public void authenticatingPointCut() {
        
    }

    @Pointcut("within(demo..*)")
    public void authorizationPointCut() {
        
    }

    // call before pointcuts
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the request!");
    }
}
