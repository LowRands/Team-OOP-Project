package ie.atu.oopgroupproject.Service;

import ie.atu.oopgroupproject.model.Profile;
import ie.atu.oopgroupproject.model.UserProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreateUserService {
    private List<UserProfile> logIns = new ArrayList<UserProfile>();

    public UserProfile createUserProfile(UserProfile logIn) {
        logIns.add(logIn);
        return logIn;
    }

    public List<UserProfile> getAllLogIns() {
        return logIns;
    }

    public UserProfile getLogInByEmail(String email) {
        for (UserProfile logIn : logIns) {
            if (logIn.getEmail() == email) {
                return logIn;
            }
        }
        throw new RuntimeException("Profile with email " + email + " not found");
    }

}
