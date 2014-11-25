/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * A 2D immutable point
 * @author Ryan Jensen
 * @version November 25, 2014
 */
public class Point {
    private int id;
    private final int x;
    private final int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //<editor-fold desc="Getters">
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getId(){
        return id;
    }
    
    //</editor-fold>
}
