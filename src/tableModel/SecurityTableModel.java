/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModel;

import entity.Account;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class SecurityTableModel extends AbstractTableModel {
    private String[] columnNames = {"SecurityID","Name","Gender","Dob","Leaves","Salary"};
    private ArrayList<Account> listData = new ArrayList<Account>();
    private ArrayList<Object[]> listObject = new ArrayList<Object[]>();
   
    //constructor
    public SecurityTableModel(ArrayList<Account> listSecurity) {
        listData=listSecurity;
        for (int i = 0; i < listSecurity.size(); i++) {
            Account tempSecurity = listSecurity.get(i);
            Object[] temp = {tempSecurity.getId(), tempSecurity.getFullName(),tempSecurity.getGender(),tempSecurity.getDob(),tempSecurity.getLeaves(),tempSecurity.getSalary()};
            listObject.add(temp);
        }
    }
    public int getColumnCount() {
        return columnNames.length;
    }
    public int getRowCount() {
        return listObject.size();
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listObject.get(rowIndex)[columnIndex];
    }
    public String getColumnName(int column) {
        return columnNames[column];
    }
    public Class getColumnClass(int column) {
        return this.getValueAt(0, column).getClass();
    }
    public Object getObjectAtRow(int row) {
        return this.listData.get(row);
    }
}
