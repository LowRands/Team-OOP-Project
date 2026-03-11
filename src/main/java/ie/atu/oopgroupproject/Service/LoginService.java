package ie.atu.oopgroupproject.Service;


import ie.atu.oopgroupproject.Exception.LoginConflict;
import ie.atu.oopgroupproject.model.Login;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    public String Username(String username, String email, String password) {
        return username;
    }

    public String Password;
    public String Email;

    private final List<Login> Logins = new ArrayList<>();

    boolean UserExists = Logins.stream()
            .anyMatch(b -> b.getUsername().equals(Login.getUsername()));

    public Login getUsername(String username) {
        return Logins.stream()
                .filter(b -> b.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new LoginConflict("Login not found: " + username));
    }


}
