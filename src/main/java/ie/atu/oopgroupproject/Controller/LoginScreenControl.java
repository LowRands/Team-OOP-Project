package ie.atu.oopgroupproject.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/Login")
public class LoginScreenControl {

    @GetMapping("/Validate")
    public Map<String, String> Validate(@RequestParam String Username, @RequestParam String Email, @RequestParam String Password) {
        Map<String, String> response = new HashMap<>();

        List<List<String>> Logins = new ArrayList<>();
        List<String> Usernames = new ArrayList<>();
        List<String> Passwords = new ArrayList<>();
        List<String> Emails = new ArrayList<>();
        if (Username == null || Username.isEmpty() || Email == null || Email.isEmpty() || Password == null || Password.isEmpty()) {
            response.put("Username:", "Invalid Username");
        } else {
            Usernames.add(Username);
            if (Usernames.contains(Username)) {
                response.put("Username:", "Valid Username");
            }
        }
        if (Email != null && Email.contains("@") && Email.contains(".")) {
            Emails.add(Email);
            if (Emails.contains(Email)) {
                response.put("Email:", "Valid Email");
            }
        } else {
            response.put("Email:", "Invalid Email");
        }
        if (Password != null) {
            Passwords.add(Password);
            if (Passwords.contains(Password)) {
                response.put("Password:", "Valid Password");
            }
        }
        Logins.add(Usernames);
        Logins.add(Emails);
        Logins.add(Passwords);
        if(Logins.contains(Usernames) && Logins.contains(Emails) && Logins.contains(Passwords)) {
            System.out.println("Login Success");
        }
        return response;
    }
}
