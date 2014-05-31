import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void displayOne(int scr)
    {
      String score=Integer.toString(scr);
      GreenfootImage g=new GreenfootImage("Player 1: "+score,25,Color.red,Color.black);
      setImage(g);
    }
    
    public void displayTwo(int scr)
    {
      String score=Integer.toString(scr);
      GreenfootImage g=new GreenfootImage("Player 2: "+score,25,Color.red,Color.black);
      setImage(g);
    }
    
     public void displayPlayer1()
     {
         GreenfootImage g=new GreenfootImage("Player 1 Wins!!",30,Color.yellow,Color.black);
         setImage(g);
         //getWorld().addObject(g,695,715);
     }
     public void displayPlayer2()
     {
         GreenfootImage g=new GreenfootImage("Player 2 Wins!!",30,Color.yellow,Color.black);
         setImage(g);
     }
    public void displayZero()
    {
        GreenfootImage g=new GreenfootImage("Both Lose!!!",20,Color.red,Color.green);
        setImage(g);
    }
    public void displayEqual()
    {
        GreenfootImage g=new GreenfootImage("It's a Tie",30,Color.yellow,Color.black);
        setImage(g);
    }
    public void displayTotalOne(int s1)
    {
      String score=Integer.toString(s1);
      GreenfootImage g=new GreenfootImage(score,30,Color.black,null);
      setImage(g);
    }
    public void displayTotalTwo(int s2)
    {
      String score2=Integer.toString(s2);
      GreenfootImage h=new GreenfootImage(score2,30,Color.black,null);
      setImage(h);
    }
    
}
