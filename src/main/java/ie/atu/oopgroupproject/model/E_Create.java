package ie.atu.oopgroupproject.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class E_Create {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    //@Schema(type = "string", format = "password", description = "User password")
    @lombok.Getter
    private String password;
    private String username;
    private String email;


}