/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hiera
 */
public class Admin {

    private String managerID;
    private String fullName;
    private Map<Duty,Integer> scheduleMap;
    private ArrayList<Duty> schedule;
    private List<Date> dutyDate;
   

   

    public Admin(String managerID, String fullName) {
        this.managerID = managerID;
        this.fullName = fullName;
        
    }

    public String getManagerID() {
        return managerID;
    }

    public String getFullName() {
        return fullName;
    }

    public Map<Duty, Integer> getScheduleMap() {
        return scheduleMap;
    }

    public ArrayList<Duty> getSchedule() {
        return schedule;
    }

    public List<Date> getDutyDate() {
        return dutyDate;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setScheduleMap(Map<Duty, Integer> scheduleMap) {
        this.scheduleMap = scheduleMap;
    }

    public void setSchedule(ArrayList<Duty> schedule) {
        this.schedule = schedule;
    }

    public void setDutyDate(List<Date> dutyDate) {
        this.dutyDate = dutyDate;
    }



}
