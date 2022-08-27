import beans.ComponentBean;
import beans.PersonalBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            var bean = context.getBean("another",PersonalBean.class);
            var bean1 = context.getBean("personal",PersonalBean.class);
            var beanSecond = context.getBean(ComponentBean.class);
            System.out.println(bean.getName());
            System.out.println(bean1.getName());
            System.out.println(beanSecond.getName());
        }catch (Exception e){
           e.printStackTrace(System.out);
        }
    }
}
