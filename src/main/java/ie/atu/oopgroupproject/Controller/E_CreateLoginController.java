package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Service.E_CreateService;
import ie.atu.oopgroupproject.model.E_Create;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Users")
public class E_CreateLoginController {

    private final E_CreateService createService;

    public E_CreateLoginController(E_CreateService userCreated) {this.createService = userCreated;}

    @PostMapping("/Register")
    public ResponseEntity<E_Create> RegisterUser(@Valid @RequestBody E_Create user){
        E_Create userCreated = createService.RegisterUser(user);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }

    @PostMapping("/Validate")
    public ResponseEntity<E_Create> ValidateUser(@Valid @RequestBody E_Create login){
        E_Create userLogin = createService.ValidateUser(login);
        return ResponseEntity.ok(userLogin);
    }
    @GetMapping
    public ResponseEntity<List<E_Create>> getALLUsers(){
        return ResponseEntity.ok(createService.getALLUsers());
    }
}

