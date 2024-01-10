package ie.atu.project_microservice_1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://localhost:8080")
public interface UserServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}
