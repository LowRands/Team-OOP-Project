package ie.atu.oopgroupproject.Service;


import ie.atu.oopgroupproject.Exception.LoginConflict;
import ie.atu.oopgroupproject.model.Login;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    private final List<Login> logins = new ArrayList<>();
    public Login createLogin(Login Login) {

//        boolean UserNameExists = logins.stream()
//                .anyMatch(b -> b.getUsername().equals(Login.getUsername()));

        for (Login login : logins) {
            if (login.getUsername().equals(Login.getUsername())) {
                return login;
            }
        }


        logins.add(Login);
        return Login;
    }

    public List<Login> getAllLogins() { return logins;}

    public Login getUsername(String username) {
        return logins.stream()
                .filter(b -> b.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new LoginConflict("Login not found: " + username));
    }


}
