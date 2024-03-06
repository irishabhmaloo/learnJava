package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        
        // this is the context
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class); 

        Staff doctor = new Doctor(); // this is the bean
        doctor.work();
    }
}