package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Constructors.Username;
import ie.atu.oopgroupproject.Service.LoginService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping


public class LoginScreenControl {
    public static void main(String[] args) {

    }

    ArrayList<Username> nameList = new ArrayList<>();
    private final LoginService Login;

    public LoginScreenControl(LoginService LoginService) {
        this.Login = LoginService;
    }

    @GetMapping("/Login")
    @Schema(format = "Password", hidden = true)
    //@Hidden
    public ResponseEntity<String> Username(@RequestParam String Username, String Email, String Password) {
        String user = Login.Username(Username, Email, Password);
        nameList.add(new Username());

        return ResponseEntity.ok("Login Successful");

//        boolean containsEmail = false; // setting contains email to false to start
//        for (Username username : nameList) {
//            if (username.getEmail().equals(email)) {
//                containsEmail = true;
//                break;
//
//            }
//        }
    }
}












































//
//
//private static HashMap<String, String> users = new HashMap<>();
//
//public static void main(String[] args){
//    users.put("admin","admin");
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter your username");
//    String username = sc.nextLine();
//    System.out.println("Enter your password");
//    String password = sc.nextLine();
//    if(login(username, password)){
//        System.out.println("Welcome "+username);
//    }
//    else {
//        System.out.println("Invalid username or password");
//    }
//    Scanner close();
//}
//public static boolean login(String username, String password){
//    return  users.containsKey(username) && users.get(username).equals(password);
//}
