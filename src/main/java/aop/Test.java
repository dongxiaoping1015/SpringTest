package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.print.attribute.standard.MediaSize;

//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
    //@Autowired
    private ISomeService service;

    @org.junit.Test
    public void test01() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (ISomeService) ac.getBean("someService");
        service.doFirst();
        service.doSecond();
        service.doThird();

    }
}
