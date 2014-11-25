/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;

/**
 * An augmented List of SwitchStmts so that data types can be created and references
 * to a list of switchStmts can easily be managed at a high level.
 * @author Ryan Jensen
 * @version November 25, 2014
 */
public class SwitchStmts {
    private int id;
    private List<SwitchStmt> switchStmts;
    private final boolean definedStyle;
    
    
    public SwitchStmts(List<SwitchStmt> switchStmts, boolean definedStyle){
        this.switchStmts = switchStmts;
        this.definedStyle = definedStyle;
    }
    
    public SwitchStmts(List<SwitchStmt> switchStmts){
        this(switchStmts, false);
    }
    
    //<editor-fold desc="Getters">
    
    public List<SwitchStmt> getSwitchStmts(){
        return switchStmts;
    }
    
    public boolean isDefinedStyle(){
        return definedStyle;
    }
    
    public int getId(){
        return id;
    }
    
    //</editor-fold>
    
    
    //<editor-fold desc="Setters">
    
    public void setSwitchStmts(List<SwitchStmt> switchStmts){
        this.switchStmts = switchStmts;
    }
    
    //</editor-fold>
}
