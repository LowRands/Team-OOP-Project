package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Service.LoginService;
import ie.atu.oopgroupproject.model.Create;
import ie.atu.oopgroupproject.model.Login;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Create/users")
public class CreateLoginController{

    private static final List<Create> users = new ArrayList<>();

    @PostMapping("/Register")
    public String registerUser(@RequestBody Create user){
        users.add(user);
        return "User " + user.getUsername() + " registered successfully";
    }

    @PostMapping("/Validate")
    public String validateUser(@Valid Login login){
        for(Create user : users){

            if(user.getUsername().equals(login.getUsername()) &&
                    user.getPassword().equals(login.getPassword()) && user.getEmail().equals(login.getEmail())){

                return "Login Successful";
            }
        }

        return "Login Failed";
    }
    @GetMapping
    public static List<Create> getUsers(){
        return users;
    }
}

