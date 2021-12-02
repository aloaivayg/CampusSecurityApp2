
import java.util.*;

public class MnagaerSecurity {

    private ArrayList<Security> securityList;
    private SecurityData securityData;

    public MnagaerSecurity(ArrayList<Security> list) {
        this.securityList = list;
        this.securityData = new SecurityData();
    }

    public void resetSchedule(Admin a) {
        a.getSchedule().clear();
        a.getScheduleMap().clear();
        for (Security s : securityList) {
            s.getDutyList().clear();
        }
    }

    public void addSchedule(Admin a, Security s, Date date, String placeID, int start, int end) {
        Duty d = new Duty(date, placeID, s, start, end);
        Map<Duty, Integer> map = a.getScheduleMap();
        List<Duty> list = a.getSchedule();
        Security s1 = d.getS();
        Integer value = map.get(d);
        if (value == null) {
            map.put(d, 1);
            list.add(d);
        }
    }

    public void deleteDuty(Admin a, Duty d) {
        a.getSchedule().remove(d);
        a.getScheduleMap().remove(d);
    }

    public void changeSecurity(Admin a, Duty d, Security s) {
        d.setS(s);
    }

    public void sendSchedule(Admin a) {
        for (Duty d : a.getSchedule()) {
            d.getS().getDutyList().add(d);
        }
    }

    public void calSalary() {
        for (Security s : securityList) {
            int count = 0;
            List<Duty> list = s.getDutyList();
            Map<Duty, Integer> attendance = s.getAttendance();

            for (int i = 0; i < list.size(); i++) {
                Duty d = list.get(i);
                Integer value = attendance.get(d);
                if (value != null) {
                    count ++;
                }
            }
            s.setSalary(count * s.getBaseSalary());
        }
    }
}
