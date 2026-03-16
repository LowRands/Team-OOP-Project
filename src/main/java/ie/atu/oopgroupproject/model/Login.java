package ie.atu.oopgroupproject.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

//@Getter
public class Login{

    private String username;
    private String email;
    private String password;

    public Login() {}

    public Login(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
//public class Login {
//        @NotNull(message = "Username Can't be empty")
//        private String Username;
//
//        @NotBlank(message = "Email is required")
//        @Email(message = "Invalid email format")
//        private String Email;
//
//        public Login(){}
//
//    public void setUsername(String roomNumber) { this.Username = Username; }
//
//    public void setEmail(String studentEmail) { this.Email = Email; }
//}
