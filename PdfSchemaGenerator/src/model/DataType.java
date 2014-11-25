/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;

/**
 * A DataType is an object that allows a user to create a named SwitchStmts object.
 * For example, the Boolean data type could be a list that switches 
 * [0->"False, 1->"True", null/else->"N/A"].  The style can then be applied to many
 * property fields throughout the project and modified consistently at a high level.
 * @author Ryan Jensen
 * @version November 25, 2014
 */
public class DataType {
    private int id;
    private String name;
    private final SwitchStmts switchStmts;
    
    public DataType(String name, List<SwitchStmt> switchStmtList){
        this.name = name;
        this.switchStmts = new SwitchStmts(switchStmtList, true);
    }
    
    //<editor-fold desc="Getters">

    public String getName(){
        return name;
    }
    
    public SwitchStmts getSwitchStmts(){
        return switchStmts;
    }
    
    public int getId(){
        return id;
    }
    
    //</editor-fold>
    
    
    //<editor-fold desc="Setters">
    
    public void setName(String name){
        this.name = name;
    }
    
    //</editor-fold>
}
