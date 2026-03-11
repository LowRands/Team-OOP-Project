package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Service.LoginService;
import ie.atu.oopgroupproject.model.Login;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


@RestController
@RequestMapping("/Login")
public class LoginScreenControl {
    public static void main(String[] args) {
    }

   // ArrayList<Username> nameList = new ArrayList<>();
    private final LoginService Login;

    public LoginScreenControl(LoginService LoginService) {
        this.Login = LoginService;
    }
    @GetMapping("/{Username}")
    public ResponseEntity<Login> getUsername(@PathVariable String Username){
        return ResponseEntity.ok(LoginService.getUsername(username));
    }

    @GetMapping("/Login")
    public ResponseEntity<String> Username(@RequestParam String Username, String Email, String Password) {
        //String user = Login.Username(Username, Email, Password);
        String fileName = "Users";
        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println("Username: " + Username);
            out.println("Email: " + Email);
            out.println("Password: " + Password);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return ResponseEntity.ok("Login Successful");
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
