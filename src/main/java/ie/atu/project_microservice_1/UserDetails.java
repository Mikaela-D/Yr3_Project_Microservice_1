package ie.atu.project_microservice_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDetails {
    private String userID;
    private String username;
    private String password;
}
