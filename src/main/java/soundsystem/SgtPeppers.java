package soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public class SgtPeppers {
    public static void main(String[] args) {
        System.out.println(Grade.A.getValue());
    }
}

interface Condition {
    boolean matches(ConditionContext ctxt, AnnotatedTypeMetadata metadata);
}

class MagicExistsCondition implements Condition {
    public boolean matches(
            ConditionContext context, AnnotatedTypeMetadata metadata
    ) {
        Environment env = (Environment) context.getEnvironment();
        return env.containsProperty("magic");
    }
}

enum Grade {
    A("100-90"), B("B"), C("C"), D("D"), E("E");
    private String value;
    Grade(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}