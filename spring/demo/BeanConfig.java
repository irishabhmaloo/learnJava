package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this is a configuration class
@ComponentScan(basePackages = "demo") // where to find the beans
public class BeanConfig {
    
    @Bean // defining a bean/component
    public Doctor doctor() {
        return new Doctor();
    }
}
