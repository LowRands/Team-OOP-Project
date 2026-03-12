package ie.atu.oopgroupproject.model;

public class UserProfile {
    public String userName;
    public String email;
    public String password;

    public UserProfile(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

   public String getEmail() {
        return email;
   }

   public String getPassword() {
        return password;
   }

   public String getUserName() {
        return userName;
   }

}


