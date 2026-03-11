package ie.atu.oopgroupproject.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class Login {
        @NotNull(message = "Username Can't be empty")
        private String Username;

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        private String Email;

        public Login(){}

    public void setUsername(String roomNumber) { this.Username = Username; }

    public void setEmail(String studentEmail) { this.Email = Email; }
}
