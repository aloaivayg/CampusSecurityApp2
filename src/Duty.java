    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    import java.util.Date;

/**
 *
 * @author Hiera
 */
public class Duty {
    private Date d;
    private String placeID;
    private Security s;
    private int start;
    private int end;

 
    public Duty(Date d, String placeID, Security s, int start, int end) {
        this.d = d;
        this.placeID = placeID;
        this.s = s;
        this.start = start;
        this.end = end;
    }

    
    
    
    public void setS(Security s) {
        this.s = s;
    }

    public Security getS() {
        return s;
    }

   

    public Date getD() {
        return d;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }
    
    
}
