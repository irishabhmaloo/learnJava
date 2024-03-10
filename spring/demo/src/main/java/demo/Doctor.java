package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware{

    public String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
       System.out.println("Doctor is working!"); 
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name called: " + name);
    }

    // @PostConstruct
    // public void postConstruct() {
    //     System.out.println("Post Constrcut called!");
    // }

}
