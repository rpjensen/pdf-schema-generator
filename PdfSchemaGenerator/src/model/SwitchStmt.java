/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author rjensen
 */
public class SwitchStmt {
    private final String find;
    private final String replace;
    
    public SwitchStmt(String find, String replace){
        this.find = find;
        this.replace = replace;
    }
    
    //<editor-fold desc="Getters">
    
    public String getFindString(){
        return find;
    }
    
    public String getReplaceString(){
        return replace;
    }
    
    //</editor-fold>

    public SwitchStmt copy(){
        return new SwitchStmt("", "");
    }
}
