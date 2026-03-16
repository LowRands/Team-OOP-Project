package ie.atu.oopgroupproject.model;



public class Profile {

    public String name;
    public int swimmerId;
    public String dob;
    public boolean medClearance;
    public boolean memberStatus;

    public Profile(){}

    public Profile(String name, int SwimmerId, String DOB, boolean medClearance, boolean memberStatus){
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
