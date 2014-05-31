import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChipFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChipFactory {
    public enum Values{
        Five,
        Ten,
        Twenty,
        Fifty
    }
    public static Chip createChip(int values )
    {
        //values= NumberInputBox.getValue();	
        Chip chip = null;
        switch( values ) {
            case 5:
            chip= new Chip ("FiveChip.PNG", 5);
            break;
            case 10:
            chip= new Chip ("TenChip.PNG", 10);
            break;
            case 20:
            chip= new Chip ("TwentyChip.PNG", 20);             
            break;
            case 50:
            chip= new Chip ("FiftyChip.PNG", 50);
            break;
        }
        return chip;
    }

    public static ChipTwo createChipTwo(int values )
    {
        ChipTwo chip = null;
        switch( values ) {
            case 5:
            chip= new ChipTwo ("FiveChip2.PNG", 5);
            break;
            case 10:
            chip= new ChipTwo ("TenChip2.PNG", 10);
            break;
            case 20:
            chip= new ChipTwo ("TwentyChip2.PNG", 20);             
            break;
            case 50:
            chip= new ChipTwo ("FiftyChip2.PNG", 50);
            break;
        }
        return chip;
    }
}  

