/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * An object that represents a 2D rectangle bounding box that is immutable
 * @author rjensen
 * @version November 25, 2014
 */
public class BoundingBox {
    private int id;
    private final Point upperLeft;
    private final int width;
    private final int height;
    
    public BoundingBox(Point upperLeft, int width, int height){
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }
    
    //<editor-fold desc="Getters">
    
    public Point getUpperLeft(){
        return upperLeft;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getId(){
        return id;
    }
    
    //</editor-fold>
    
    
    
}
