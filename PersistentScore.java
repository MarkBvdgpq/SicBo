import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class PersistantScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersistentScore extends Actor
{
    /**
     * Act - do whatever the PersistantScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

   public void displayOne()
   {
      GreenfootImage g=new GreenfootImage("Player 1 Total : ",30,Color.yellow,Color.green);
      setImage(g);
    }
    
    public void displayTwo()
    {
      GreenfootImage h=new GreenfootImage("Player 2 Score : ",30,Color.yellow,Color.green);
      setImage(h);
    }

}
