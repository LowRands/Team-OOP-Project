package ie.atu.oopgroupproject.Service;

import ie.atu.oopgroupproject.model.SwimmerProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreateProfileService {
    private List<SwimmerProfile> SwimmerProfiles = new ArrayList<SwimmerProfile>();

    public SwimmerProfile createProfile(SwimmerProfile swimmer) {
        if(swimmer.getMemberStatus() && !swimmer.getMedClearance()) {
            throw new RuntimeException("Can't be an active swimmer without medical clearance");
        }

        SwimmerProfiles.add(swimmer);
        return swimmer;
    }

    public List<SwimmerProfile> getAllProfiles() {
        return SwimmerProfiles;
    }

    public SwimmerProfile getSwimmerById(String id) {
        for(SwimmerProfile swimmer : SwimmerProfiles) {
            if(swimmer.getSwimmerId() == Integer.parseInt(id)) {
                return swimmer;
            }
        }
        throw new RuntimeException("Swimmer Profile with id " + id + " not found");
    }
    public void deleteSwimmerProfileById(String id) {
        for(SwimmerProfile swimmer : SwimmerProfiles) {
            if(swimmer.getSwimmerId() == Integer.parseInt(id)) {
                SwimmerProfiles.remove(swimmer);
            }
        }
    }
}

