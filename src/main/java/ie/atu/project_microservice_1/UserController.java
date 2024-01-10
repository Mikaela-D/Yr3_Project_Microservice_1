package ie.atu.project_microservice_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserDetails userDetails) {
        return ResponseEntity.ok(userService.loginUser(userDetails));
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDetails userDetails) {
        return ResponseEntity.ok(userService.registerUser(userDetails));
    }
}
