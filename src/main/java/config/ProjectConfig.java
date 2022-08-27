package config;

import beans.PersonalBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean("personal")
    //@Primary: if you use just by type then you should specify the default bean
    public PersonalBean personalBean(){
        PersonalBean bean = new PersonalBean();
        bean.setName("default bean");
        return bean;
    }

    @Bean("another")
    public PersonalBean anotherBean(){
        PersonalBean bean = new PersonalBean();
        bean.setName("bean 1");
        return bean;
    }
}
