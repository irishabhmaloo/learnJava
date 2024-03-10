package demo;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo") // where to scan for beans
public class BeanConfig {
    
    // @Bean // bean that needs to be loaded
    // public Doctor doctor() {
    //     return new Doctor();
    // }
}
