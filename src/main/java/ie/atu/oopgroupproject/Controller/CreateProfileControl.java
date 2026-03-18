package ie.atu.oopgroupproject.Controller;

import ie.atu.oopgroupproject.Service.CreateProfileService;
import ie.atu.oopgroupproject.model.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")

public class CreateProfileControl {
    private final CreateProfileService profileService;

    public CreateProfileControl(CreateProfileService createProfileService) {
        this.profileService = createProfileService;
    }

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile){
        return profileService.createProfile(profile);
    }
}


