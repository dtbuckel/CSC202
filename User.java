package createuseraccount;

import java.io.Serializable;

/**
 *
 * @author dougbuckel
 */

public class User extends Person implements Serializable, Comparable<User>{
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String profilePic;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(String username, String email, String phoneNumber, 
            String password, String profilePic){
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.profilePic = profilePic;
    }
    
    public User(String firstName, String lastName, String ssn, String dob, 
            String gender, String username, String email, String phoneNumber, 
            String password, String profilePic){
        super(firstName, lastName, ssn, dob, gender);
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.profilePic = profilePic;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getProfilePic(){
        return profilePic;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setProfilePic(String profilePic){
        this.profilePic = profilePic;
    }
    
    public boolean equals(User user){
        return(this.username.equals(user.username));
    }
    
    @Override
    public int compareTo(User user){
        return(this.username.compareTo(user.username));
    }
    
    @Override
    public String toString(){
        return "User{" + "username = \"" + username + "\", email = \"" + 
                email + "\", phoneNumber = \"" + phoneNumber + "\", password = \"" 
                + password + "\", profilePic = \"" + profilePic + "\"}";
    }
} //public class User
