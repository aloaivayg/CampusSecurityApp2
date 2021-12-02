package entity;

import java.util.Date;

public class Duty {
    private Date d;
    private int placeID;
    private Account s;
    private int start;
    private int end;


    public Duty(Date d, int placeID, Account s, int start, int end) {
        this.d = d;
        this.placeID = placeID;
        this.s = s;
        this.start = start;
        this.end = end;
    }




    public void setS(Account s) {
        this.s = s;
    }

    public Account getS() {
        return s;
    }



    public Date getD() {
        return d;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
