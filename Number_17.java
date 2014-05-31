import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seventeen_OneWinsSixty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number_17 extends OneWinsSixty
{
   public Number_17()
   {
       highlightimage = "Highlight_Seventeen_OneWinsSixty.png";
       image = "Seventeen_OneWinsSixty.PNG";
   }
 
   
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { highlight(); }
    }
    
    
}
