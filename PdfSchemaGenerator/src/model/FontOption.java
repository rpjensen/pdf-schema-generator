/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.EnumSet;

/**
 * A FontOption object encapsulates a basic font style which includes a font name,
 font size, and font attributes
 * @author Ryan Jensen
 * @version November 25, 2014
 */
public class FontOption {
    private static final FontManager fontManager = new FontManager();
    public static final double FONT_SIZE_TOL = 0.1;
   
    
    private int id;
    private String fontName;
    private double fontSize;
    private EnumSet<FontAttribute> fontAttributes;
    
    public FontOption(String fontName, double fontSize, EnumSet<FontAttribute> fontAttributes){
        if (!fontManager.validFontForName(fontName)){
            throw new IllegalArgumentException("The given font is not availible");
        }
        this.fontName = fontName;
        validateFontSize(fontSize);
        this.fontSize = fontSize;
        this.fontAttributes = fontAttributes;
    }
    
    public void addAttribute(FontAttribute attribute){
        fontAttributes.add(attribute);
    }
    
    //<editor-fold desc="Getters">
    
    public String getFontName(){
        return fontName;
    }
    
    public double getFontSize(){
        return fontSize;
    }
    
    public String getDisplayFontSize(){
        if (Math.abs(Math.round(fontSize) - fontSize) < FONT_SIZE_TOL){
            return String.valueOf(fontSize);
        }
        else {
            return String.format("%.1f", fontSize);
        }
    }
    
    public EnumSet<FontAttribute> getFontAttributes(){
        return fontAttributes;
    }
    
    //</editor-fold>

    
    //<editor-fold desc="Setters">
    
    public void setFontName(String fontName){
        if (!fontManager.validFontForName(fontName)){
            throw new IllegalArgumentException("The given font is not availible");
        }
        this.fontName = fontName;
    }
    
    
    public void setFontSize(double fontSize){
        validateFontSize(fontSize);
        this.fontSize = fontSize;
    }
    
    public void setFontAttributes(EnumSet<FontAttribute> fontAttributes){
        this.fontAttributes = fontAttributes;
    }
    
    //</editor-fold> 
   
   
    //<editor-fold desc="Static Methods">
    
    private static void validateFontSize(double fontSize){
        if (fontSize - 4 <= FONT_SIZE_TOL){
            throw new IllegalArgumentException("Font size smaller than the acceptable limit " + fontSize);
        }
    }
    
    //</editor-fold>
    
    public enum FontAttribute{
        //Types
        NORMAL("Normal"), CAPITALIZED("Capitalized"), BOLD("Bold"), ITALIC("Italics"), UNDERLINE("Underlined");
        
        //Fields
        private final String displayName;
        
        //Constructor
        FontAttribute(String displayName){
            this.displayName = displayName;
        }
        
        //Methods
        public String getDisplayName(){
            return displayName;
        }
    }
    
    public static void main(String[] args){
        FontOption font = new FontOption("blah", 10, EnumSet.of(FontAttribute.NORMAL));
        System.out.println(font.getFontAttributes().toString());
        font.addAttribute(FontOption.FontAttribute.BOLD);
        System.out.println(font.getFontAttributes().toString());
    }
}
