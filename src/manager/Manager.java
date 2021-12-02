/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import dao.DAO;
import entity.Account;
import entity.Duty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import tableModel.*;

/**
 *
 * @author Hiera
 */
public class Manager {

    private ArrayList<Account> accList;
    private ArrayList<Duty> dutyList;
    private DAO DA;

    public Manager(ArrayList<Account> accList) {
        this.accList = accList;
        this.DA = new DAO();
        this.dutyList = getDutyList();
    }

    public ArrayList<Duty> getDutyList() {
        ArrayList<Duty> dutyList = new ArrayList<>();
        for (Account acc : accList) {
            for (Duty d : acc.getDutyList()) {
                dutyList.add(d);
            }
        }
        dutyList.sort((d1, d2) -> d1.getD().compareTo(d2.getD()));
        return dutyList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public void setDutyList(ArrayList<Duty> dutyList) {
        this.dutyList = dutyList;
    }

    public void setDA(DAO DA) {
        this.DA = DA;
    }

    public Manager() {
        this.accList = new ArrayList<>();
        this.DA = new DAO();
    }

    public void clearAllDuty() {
        this.dutyList.clear();
        for (Account acc : accList) {
            acc.getDutyList().clear();
        }
    }

    public boolean addAcc(Account acc) {
        boolean res = false;
        Account tempAcc = this.getAccByAccID(acc.getAccID());
        if (tempAcc == null) {
            this.accList.add(acc);
            res = true;
        }
        return res;
    }

    public DAO getDA() {
        return DA;
    }

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public Account getAccByAccID(String ID) {
        Account acc = null;
        for (int i = 0; i < this.accList.size(); i++) {
            if (this.accList.get(i).getAccID().equalsIgnoreCase(ID)) {
                return this.accList.get(i);
            }
        }
        return acc;
    }

    public ArrayList<Account> getAllSec() {
        ArrayList<Account> list = new ArrayList<>();
        for (Account acc : this.accList) {

            if (acc.getType().equals("Security")) {
                list.add(acc);

            }
        }
        return list;
    }

    public ArrayList<Account> getAccByID(int ID) {
        ArrayList<Account> list = new ArrayList<>();
        for (Account acc : this.accList) {
            if (acc.getId() == ID) {
                if (acc.getType().equals("Security")) {
                    list.add(acc);

                }
            }
        }
        return list;
    }

    public ArrayList<Duty> getDutyByDate(Date d) {
        ArrayList<Duty> searchList = new ArrayList<>();
        for (Duty duty : dutyList) {
            if (duty.getD().equals(d)) {
                searchList.add(duty);
            }
        }
        return searchList;
    }

    public ArrayList<Account> getList() {
        return accList;
    }

    public int saveByteData() {
        this.DA.saveListSecurityasByte(accList);
        return this.accList.size();
    }

    public int getByteDataOverride() {
        this.DA.createFolder();
        this.accList = this.DA.readListSecurityasByte();
        return this.accList.size();
    }

    public DutyTableModel getDutyTable() {
        DutyTableModel tableModel = new DutyTableModel(this.getDutyList());
        return tableModel;
    }
}
