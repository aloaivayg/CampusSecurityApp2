/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

public class SecurityData {

  private String dataPath = "Data";
    private String fileNameByte = "SecurityData.backup";

    public SecurityData() {
        this.createFolder();
    }

    public void createFolder() {
        File dataFolder = new File(dataPath);
        if (!dataFolder.exists()) {
            dataFolder.mkdirs();
        }
    }

    public void saveListSecurityAsByte(ArrayList<Security> securityList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(dataPath + "\\" + fileNameByte);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(securityList);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<Security> readListSecurityAsByte() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Security> securityList = new ArrayList<>();
        try {
            fis = new FileInputStream(dataPath + "\\" + fileNameByte);
            ois = new ObjectInputStream(fis);
            securityList = (ArrayList<Security>) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return securityList;
    }
}
