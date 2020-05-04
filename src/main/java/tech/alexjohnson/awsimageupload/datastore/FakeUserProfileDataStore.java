package tech.alexjohnson.awsimageupload.datastore;

import org.springframework.stereotype.Repository;
import tech.alexjohnson.awsimageupload.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("83265b3a-a0a2-43ba-8b6c-72aa104624d6"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("803933ae-79eb-4afc-82e9-c94e917dcd3a"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
