import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quit_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuitButton extends Actor implements GameState
{
    GameState state;
    private GreenfootImage background;
    
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)){
        GameState finalState = new Final();
        setState(finalState);
        createWorld();
        Greenfoot.playSound("cheer.mp3");
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
}
