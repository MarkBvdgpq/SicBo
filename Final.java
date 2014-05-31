import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final extends Actor implements GameState
{
    /**
     * Act - do whatever the Final wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action 
    }
    
    public void createWorld()
    {
        Greenfoot.setWorld(new GameOver());
    }
}
