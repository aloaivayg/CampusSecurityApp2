import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Security implements Serializable {

    private String securityID;
    private String fullName;
    private double baseSalary;
    private double salary;
    private int remainLeaves;
    private String status;
    private List<Duty> dutyList;
    private Map<Duty,Integer> attendance;

    public Security(String securityID, String fullName, double baseSalary, double salary, int remainLeaves, String status) {
        this.securityID = securityID;
        this.fullName = fullName;
        this.baseSalary = baseSalary;
        this.salary = salary;
        this.remainLeaves = remainLeaves;
        this.status = status;
        this.dutyList = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getSecurityID() {
        return securityID;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public int getRemainLeaves() {
        return remainLeaves;
    }

    public String getStatus() {
        return status;
    }

    public List<Duty> getDutyList() {
        return dutyList;
    }

    public Map<Duty, Integer> getAttendance() {
        return attendance;
    }

    public void setSecurityID(String securityID) {
        this.securityID = securityID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRemainLeaves(int remainLeaves) {
        this.remainLeaves = remainLeaves;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDutyList(List<Duty> dutyList) {
        this.dutyList = dutyList;
    }

    public void setAttendance(Map<Duty, Integer> attendance) {
        this.attendance = attendance;
    }

   

    

}
