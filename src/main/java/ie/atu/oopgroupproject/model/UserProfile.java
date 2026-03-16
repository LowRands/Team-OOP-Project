package ie.atu.oopgroupproject.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserProfile {
    @NotBlank (message = "Please enter a name")
    public String userName;
    @Email (message = "Please enter a valid email")
    public String email;
    @NotBlank (message = "Please enter a valid Password")
    public String password;

    public UserProfile(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

   public String getEmail() {
        return email;
   }

   public String getPassword() {
        return password;
   }

   public String getUserName() {
        return userName;
   }

}


