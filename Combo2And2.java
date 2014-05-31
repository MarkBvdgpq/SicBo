import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleTwo_OneWinsEleven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combo2And2 extends OneWinsEleven
{
   public Combo2And2()
   {
   highlightimage = "Highlight_DoubleTwo_OneWinsEleven.png";
   image = "DoubleTwo_OneWinsEleven.PNG";
   }   
    
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { highlight(); }
    } 
   
}
