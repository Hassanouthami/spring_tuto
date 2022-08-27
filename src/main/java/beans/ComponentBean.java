package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentBean {
    String name;

    @PostConstruct
    private void init(){
          this.name="this is example of adding to context by annotation of component";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
