package ie.atu.oopgroupproject.Service;

import ie.atu.oopgroupproject.model.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreateProfileService {
    private List<Profile> profiles = new ArrayList<Profile>();

    public Profile createProfile(Profile profile) {
        if(profile.getMedClearance() && !profile.getMedClearance()) {
            throw new RuntimeException("Can't be an active swimmer without medical clearance");
        }

        profiles.add(profile);
        return profile;
    }

    public List<Profile> getAllProfiles() {
        return profiles;
    }

    public Profile getProfileById(String id) {
        for(Profile profile : profiles) {
            if(profile.getSwimmerId() == Integer.parseInt(id)) {
                return profile;
            }
        }
        throw new RuntimeException("Profile with id " + id + " not found");
    }
    public void deleteProfileById(String id) {
        for(Profile profile : profiles) {
            if(profile.getSwimmerId() == Integer.parseInt(id)) {
                profiles.remove(profile);
            }
        }
    }
}

