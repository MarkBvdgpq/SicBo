import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Five_OneWinsTwenty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number_5 extends OneWinsTwenty
{
   public Number_5()
    {
    highlightimage = "Highlight_Five_OneWinsTwenty.png";
    image = "Five_OneWinsTwenty.PNG";
    }
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { highlight(); }
    } 
    
}
