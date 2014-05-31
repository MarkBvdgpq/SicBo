import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChipTwo extends Actor
{
    int value = 0;
    int mouseX, mouseY = 0;
    static boolean cFlag=true;
    
    public ChipTwo(String chipImage, int chipValue)
    {
        setImage(chipImage);
        value= chipValue;
       
    }
    public void act() 
    {
        if(cFlag)
        {
            if(Greenfoot.mouseDragged(this)) 
            { 
                MouseInfo mouse = Greenfoot.getMouseInfo(); 
                mouseX=mouse.getX(); 
                mouseY=mouse.getY();
                setLocation(mouseX, mouseY); // Add your action code here.
            }    
        }
    }   
}
