package ie.atu.oopgroupproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SwimmerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int swimmerId;
    public String name;
    public String dob;
    public boolean medClearance;
    public boolean memberStatus;

    public SwimmerProfile(){}

    public SwimmerProfile(String name, int SwimmerId, String DOB, boolean medClearance, boolean memberStatus){
        this.name = name;
        this.swimmerId = SwimmerId;
        this.dob = DOB;
        this.medClearance = medClearance;
        this.memberStatus = memberStatus;
    }
    public String getName(){
        return name;
    }
    public int getSwimmerId(){
        return swimmerId;
    }
    public String getDob(){
        return dob;
    }
    public boolean getMedClearance() {
        return medClearance;
    }
    public boolean getMemberStatus() {
        return memberStatus;
    }

}
