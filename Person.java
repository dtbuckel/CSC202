package createuseraccount;

import java.io.Serializable;

/**
 *
 * @author dougbuckel
 */

public class Person implements Serializable{
    
    private String firstName;
    private String lastName;
    private String ssn;
    private String dob;
    private String gender;
    
    public Person(){ //default constructor
        this.firstName = "Darth";
        this.lastName = "Vader";
        this.ssn = "123-45-6789";
        this.dob = "01/01/1900";
        this.gender = "male";
    }
    
    public Person(String firstName, String lastName, String ssn, String dob, 
            String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.gender = gender;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public String getSsn(){
        return ssn;
    }
    
    public String getDob(){
        return dob;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return "Person{" + "firstName = \"" + firstName + "\", lastName = \"" + 
                lastName + "\", ssn = \"" + ssn + "\", dob = \"" + dob + 
                "\", gender = \"" + gender + "\"}";
    }
    
} //public class Person
