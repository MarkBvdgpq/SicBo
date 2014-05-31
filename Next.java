import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Actor implements GameState
{
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void createWorld()
    {
        Greenfoot.setWorld(new SicBoWorld()); 
   }
}
