import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display implements ICommand
{
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    IPlayer ip; 
    public Display(IPlayer ip)
    {
        this.ip=ip;
    }
    public void execute()
    {
        ip.status();
    }
}
