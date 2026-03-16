package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Service.LoginService;
import ie.atu.oopgroupproject.model.Login;
import jakarta.validation.Valid;
import org.apache.commons.lang3.Validate;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//
//@RestController
//@RequestMapping("/Login")
//public class LoginScreenControl {
//
//    private final LoginService loginService;
//
//    public LoginScreenControl(LoginService loginService){
//        this.loginService = loginService;
//    }
//
//    @PostMapping("/validate")
//    public String validateUser(@Valid @RequestParam Login Login){
//        return loginService.validateUser(Login);
//    }
//
//    @PostMapping("/create")
//    public String createUser(@Valid @RequestParam Login Login){
//        loginService.addUser(Login);
//        return "User Created";
//    }
//

//    @GetMapping("/Validate")
//    public HashMap<String, String> Validate(@RequestParam String Username, @RequestParam String Email, @RequestParam String Password) {
//        HashMap<String, String> response = new HashMap<>();
////
////        List<String> Usernames = new ArrayList<>();
////        List<String> Passwords = new ArrayList<>();
////        List<String> Emails = new ArrayList<>();
//
//        if (Validate(String, String, String ).equals(CreateLoginController.getUsers())) {
//            response.put("status", "success");
//        } else {
//            response.put("Error", "Username or Email Already Exists");
//        }
//        return response;
//    }

//        if (Username == null || Username.isEmpty() || Email == null || Email.isEmpty() && Email.contains("@") && Email.contains(".") || Password == null || Password.isEmpty() || Password != null) {
//            if (Usernames.contains(Username) && Emails.contains(Email) && Passwords.contains(Password)) {
//                response.put("Status:", "Login Successful");
//            } else {
//                response.put("Status:", "Login Failed. Incorrect Username, Email or Password");
//            }
//        }
//            return response;
//        }

//}
