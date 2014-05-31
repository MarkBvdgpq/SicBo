import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreateChip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateChip1 extends CreateChip
{
   public void act()
   {
       if(Greenfoot.mouseClicked(this))
        {
            List <NumberInputBox> num1 = getWorld().getObjects(NumberInputBox.class);
            Chip chip = ChipFactory.createChip(num1.get(0).inputValue);
            getWorld().addObject(chip, 295, 789);            
        }
   }
}
