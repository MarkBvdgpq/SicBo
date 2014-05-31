import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleOne_OneWinsEleven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combo1And1 extends OneWinsEleven
{
   public Combo1And1()
   {
   highlightimage = "Highlight_DoubleOne_OneWinsEleven.png";
   image = "DoubleOne_OneWinsEleven.PNG";
   }
   
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { highlight(); }
    } 
    }
