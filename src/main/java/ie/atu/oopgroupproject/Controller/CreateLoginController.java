package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.model.Create;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Create/users")
public class CreateLoginController{
    private static final List<Create> users = new ArrayList<>();

    @PostMapping("/register")
    public String registerUser(@RequestBody Create user){
        users.add(user);
        return "User " + user.getUsername() + " registered successfully";
    }

    @GetMapping
    public static List<Create> getUsers(){
        return users;
    }
}

