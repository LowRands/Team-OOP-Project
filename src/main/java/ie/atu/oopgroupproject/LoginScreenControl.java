package ie.atu.oopgroupproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//import Constructors.Username;
import Constructors.Username;
import ie.atu.oopgroupproject.Service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginScreenControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Username> namelist = new ArrayList<>();
        namelist.add(new Username());

        System.out.print("Please enter your email: ");
        String email = input.next();

        boolean containsEmail = false; // setting contains email to false to start
        for (Username username : namelist) {
            if(username.getEmail().equals(email)){
                containsEmail = true;
                break;

            }
        }
    }


//    private HashMap<String, String> Login = new HashMap<>();
    private final LoginService Login;
    public LoginScreenControl(LoginService LoginService) {this.Login = LoginService;}

    @GetMapping("/Username")
    public ResponseEntity<String> Username(@RequestParam String username) {
        String user = Login.Username(username);
        return  ResponseEntity.ok(user);
    }
}
