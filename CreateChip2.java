import greenfoot.*; 
import java.util.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CreateChip2 extends CreateChip
{
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            List <NumberInputBox> num2 = getWorld().getObjects(NumberInputBox.class);
            ChipTwo chipTwo = ChipFactory.createChipTwo(num2.get(0).inputValue);           
            getWorld().addObject(chipTwo, 1065,789);            
        }   
    }    
}
