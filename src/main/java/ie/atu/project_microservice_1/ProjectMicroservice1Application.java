package ie.atu.project_microservice_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectMicroservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMicroservice1Application.class, args);
    }

}
