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
        Usernames.add("Ethan");
        Passwords.add("123");
        Emails.add("Ethan@gmail.com");
        if (Username == null || Username.isEmpty() || Email == null || Email.isEmpty() && Email.contains("@") && Email.contains(".") || Password == null || Password.isEmpty() || Password != null) {
            if (Usernames.contains(Username) && Emails.contains(Email) && Passwords.contains(Password)) {
                response.put("Status:", "Login Successful");
            } else {
                response.put("Status:", "Login Failed. Incorrect Username, Email or Password");
            }
        }
            return response;
        }
    }

