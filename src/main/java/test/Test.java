package test;

import entity.Student;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IStudentService;

import java.util.List;

public class Test {

    private IStudentService service;

    @Before
    public void before() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IStudentService) ac.getBean("myStudentService");
    }

    @org.junit.Test
    public void test01() {
        Student student = new Student("张三", 21);
        service.addStudent(student);
    }

    @org.junit.Test
    public void test02() {
        List<Student> students = service.queryAllStudent();
        for (Student student : students
             ) {
            System.out.println(student);
        }
    }

}
