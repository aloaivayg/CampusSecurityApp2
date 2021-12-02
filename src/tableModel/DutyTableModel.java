/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModel;

import entity.Account;
import entity.Duty;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class DutyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Date","Full name","Place ID","Start","End"};
    private ArrayList<Duty> listData = new ArrayList<Duty>();
    private ArrayList<Object[]> listObject = new ArrayList<Object[]>();
   
    //constructor
    public DutyTableModel(ArrayList<Duty> listD) {
        listData=listD;
        for (int i = 0; i < listD.size(); i++) {
            Duty value = listD.get(i);
            Object[] temp = {value.getD(), value.getS().getFullName(),value.getPlaceID(),value.getStart(),value.getEnd()};
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
