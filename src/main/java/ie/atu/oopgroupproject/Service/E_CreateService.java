package ie.atu.oopgroupproject.Service;

import ie.atu.oopgroupproject.Repository.E_LoginRepo;
import ie.atu.oopgroupproject.model.E_Create;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class E_CreateService {
    private List<E_Create> UsersCreated;
    private final E_LoginRepo UsersRepo;

    public E_CreateService(E_LoginRepo usersRepo) {
        this.UsersRepo = usersRepo;
    }

    public E_Create RegisterUser(E_Create userCreated) {

        userCreated.setEmail(userCreated.getEmail().toLowerCase());
        if (userCreated.getEmail().contains("@") && userCreated.getEmail().contains(".")) {

            UsersCreated = UsersRepo.findAll();
            boolean userExists = UsersCreated.stream()
                    .anyMatch(u -> u.getEmail().equals(userCreated.getEmail()));
            if (userExists) {
                throw new RuntimeException("User with email " + userCreated.getEmail() + " already exists");
            }

            UsersRepo.save(userCreated);
            return userCreated;
        }
        else{
            throw new RuntimeException("Email is in an incorrect format");
        }
    }

    public E_Create ValidateUser(E_Create userCreated) {
        for (E_Create user : UsersCreated) {
            if (user.getUsername().equals(userCreated.getUsername()) && user.getPassword().equals(userCreated.getPassword()) && user.getEmail().equals(userCreated.getEmail())) {
                return user;
            }
        }
        throw new RuntimeException("User with email " + userCreated.getEmail() + " does not exist");
    }
    public List<E_Create> getALLUsers() {
        return UsersRepo.findAll();
    }
}

