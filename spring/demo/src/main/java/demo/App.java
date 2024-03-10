package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
    public static void main( String[] args )
    {
        // java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);        
        
        // Staff d1 = context.getBean(Doctor.class);
        // d1.assist();

        Doctor d2 = context.getBean(Doctor.class);
        d2.setQualification("MBBS");
        System.out.println(d2.getQualification());

        Doctor d3 = context.getBean(Doctor.class);
        d3.setQualification("NEET");
        System.out.println(d2.getQualification());
        System.out.println(d3.getQualification());
    }
}
