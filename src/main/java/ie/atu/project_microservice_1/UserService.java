package ie.atu.project_microservice_1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserDetails> userList = new ArrayList<>();

    public String loginUser(UserDetails userDetails) {
        return "User logged in successfully";
    }

    public String registerUser(UserDetails userDetails) {
        userList.add(userDetails);
        return "User registered successfully";
    }
}
