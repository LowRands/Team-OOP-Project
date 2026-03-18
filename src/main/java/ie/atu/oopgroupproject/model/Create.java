package ie.atu.oopgroupproject.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

public class Create {
    @Getter
    private String username;
    @Getter
    private String email;
    private String password;

    public Create(String username, String email, String password) {
        this.username = username;
        this.email = email.toLowerCase();

            this.password = password;

    }

    @Schema(type = "string", format = "password", description = "User password")
    public String getPassword() {
        return password;
    }
}