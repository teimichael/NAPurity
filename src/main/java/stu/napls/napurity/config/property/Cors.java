package stu.napls.napurity.config.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cors {

    @Value("${cors.front-app-url}")
    private String frontAppUrl;

    public String getFrontAppUrl() {
        return frontAppUrl;
    }

}
