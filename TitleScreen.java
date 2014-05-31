import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class TitleScreen extends World
{
    PlayButton play = new PlayButton();
    //boolean gettingNumber = false;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 900, 1);
        prepare();
       // addObject(new NumberInputBox(), 372, 176);
        //gettingNumber = true;
        
    }
    public void act()
    {
       //if (play.getStart() == true)
       //{
       //     Greenfoot.setWorld(new SicBoWorld());
       // }
    }
    
    private void prepare()
    {
        //Play button
        addObject(play, 123, 72);

        // playbutton.setLocation(374, 217);
        play.setLocation(715, 507);
    }
}