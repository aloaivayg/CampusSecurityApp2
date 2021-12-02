package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {

    private int id;
    private String accID;
    private char[] pass;

    private String fullName;
    private String gender;
    private Date dob;
    private double baseSalary;
    private double salary;
    private int leaves;
    private String type;
    protected List<Duty> dutyList;
    protected Map<Duty, Integer> attendance;

    public Account(int id, String fullName, String gender, Date dob, String accID,char[] pass,String type ) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.baseSalary = 100;
        this.leaves = 0;
        this.dutyList = new ArrayList<>();
        this.accID = accID;
        this.pass = pass;
        this.attendance = new HashMap<>();
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getAccID() {
        return accID;
    }

    public char[] getPass() {
        return pass;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public int getLeaves() {
        return leaves;
    }

    public List<Duty> getDutyList() {
        return dutyList;
    }

    public Map<Duty, Integer> getAttendance() {
        return attendance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public void setPass(char[] pass) {
        this.pass = pass;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public void setDutyList(List<Duty> dutyList) {
        this.dutyList = dutyList;
    }

    public void setAttendance(Map<Duty, Integer> attendance) {
        this.attendance = attendance;
    }

   

    public String getInfoAsString() {
        String str = this.getAccID();
        str += "," + this.getPass();
        str += "," + this.getFullName();
        str += "," + this.getGender();
        str += "," + this.getDob();
        str += "," + this.getBaseSalary();
        str += "," + this.getLeaves();
        str += "," + this.getSalary();
        return str;
    }
}
