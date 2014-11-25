/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * An object that represents a property that is a raw data source and set of
 * switch statements to replace the raw value with something else for particular
 * values.
 * @author Ryan Jensen
 * @version November 25, 2014
 */
public class PropertyField {
    private int id;
    private final String propertyName;
    private String displayName;
    private SwitchStmts switchStmts;
    
    public PropertyField(String propertyName, String displayName, SwitchStmts switchStmts){
        this.propertyName = propertyName;
        this.displayName = displayName;
        this.switchStmts = switchStmts;
    }
    
    //<editor-fold desc="Getters">
    
    public String getPropertyName(){
        return propertyName;
    }
    
    public String getDisplayName(){
        return displayName;
    }
    
    public SwitchStmts getSwitchStmts(){
        return switchStmts;
    }
    
    public int getId(){
        return id;
    }
    
    //</editor-fold>
    //
    //<editor-fold desc="Setters">
    
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }
    
    public void setSwitchStmts(SwitchStmts switchStmts){
        this.switchStmts = switchStmts;
    }
    
    //</editor-fold>
}
