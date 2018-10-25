package dong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class School {
    @Value("PekingUni")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
