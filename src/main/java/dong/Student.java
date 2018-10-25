package dong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Map;

@Component("myStudent")
public class Student {
    @Value("Wang")
    private String name;
    @Value("18")
    private int age;
    @Resource
    private School school;
    private Map<String, String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
    @PostConstruct
    public void initAfter() {
        System.out.println("当前Bean初始化刚完成");
    }
    @PreDestroy
    public void preDestory() {
        System.out.println("当前Bean即将被销毁");
    }
}
