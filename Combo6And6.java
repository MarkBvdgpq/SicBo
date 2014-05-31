import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleSix_OneWinsEleven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combo6And6 extends OneWinsEleven
{
   public Combo6And6()
   {
   highlightimage = "Highlight_DoubleSix_OneWinsEleven.png";
   image = "DoubleSix_OneWinsEleven.PNG";
   }
    
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { highlight(); }
    } 
    
}
