import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Four_OneWinsSixty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number_4 extends OneWinsSixty
{
   public Number_4()
   {
       highlightimage = "Highlight_Four_OneWinsSixty.png";
       image = "Four_OneWinsSixty.PNG";
   }
   public void act() 
    {
        if(Greenfoot.mousePressed(this)) { 
          highlight(); }
    } 
    public void highlight()
   {
       setImage(highlightimage);
   }
}
