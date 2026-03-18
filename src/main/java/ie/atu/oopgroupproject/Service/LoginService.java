package ie.atu.oopgroupproject.Service;

import ie.atu.oopgroupproject.model.Login;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private List<Login> users = new ArrayList<>();

    public String validateUser(Login login){

        for(Login user : users){

            if(user.getUsername().equals(login.getUsername()) &&
                    user.getPassword().equals(login.getPassword()) && user.getEmail().equals(login.getEmail())){

                return "Login Successful";
            }
        }

        return "Login Failed";
    }

    public void addUser(Login login){
        users.add(login);
    }

}
