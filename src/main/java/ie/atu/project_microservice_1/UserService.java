package ie.atu.project_microservice_1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserDetails> userList = new ArrayList<>();

    public String loginUser(UserDetails user) {
        return "User logged in successfully";
    }

    public String registerUser(UserDetails user) {
        userList.add(user);
        return "User registered successfully";
    }
}
