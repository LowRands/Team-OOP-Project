package ie.atu.oopgroupproject.model;

public class Profile {
    public String name;
    public int SwimmerId;
    public String DOB;
    public boolean medClearance;
    public boolean memberStatus;

    public Profile(String name, int SwimmerId, String DOB, boolean medClearance, boolean memberStatus){
        this.name = name;
        this.SwimmerId = SwimmerId;
        this.DOB = DOB;
        this.medClearance = medClearance;
        this.memberStatus = memberStatus;
    }

    public String getName() {
        return name;
    }
    public int getSwimmerId() {
        return SwimmerId;
    }
    public String getDOB() {
        return DOB;
    }
    public boolean getMedClearance() {
        return medClearance;
    }
    public boolean getMemberStatus() {
        return memberStatus;
    }

}
//