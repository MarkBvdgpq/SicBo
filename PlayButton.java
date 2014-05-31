import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor implements GameState
{
    GameState state;
    private boolean Startgame = false; 
    private boolean clicked = false;
    private GreenfootImage background;
    
    public PlayButton(){
        background = getImage();
        updateImage();
    }
    
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
        GameState next = new Next();
        setState(next);
        createWorld();
        Greenfoot.playSound("Place_your_bets.mp3");
        //updateImage();
        }
    }    
    
    
    public GameState getState(){
       return this.state;
    }
    
    public void setState(GameState state){
        this.state = state;
    }
    
    public void createWorld(){
        this.state.createWorld();
    }
    
    private void updateImage(){
        
        GreenfootImage image = new GreenfootImage(background);
        setImage(image);
    }
    
    
}
