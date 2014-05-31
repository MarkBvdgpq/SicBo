import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayerTwo implements IPlayer
{
      private static boolean flag=false;
    /**
     * Act - do whatever the PlayerOn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }  
    
    public void status()
    {
        setFlag(true);
    }
    public static void setFlag(boolean f)
    {
        flag=f;
    }
    public static boolean getFlag()
    {
        return flag;
    }
}