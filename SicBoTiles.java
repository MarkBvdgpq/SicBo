import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class SicBoTiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SicBoTiles extends Actor implements IObserver
{
    int factor = 0;
    String highlightimage;
    String image;

    public SicBoTiles()
    {
        highlightimage = "";
        image = "";
    }

    public void highlight()
    {
        setImage(highlightimage);
    }

    public void reset()
    {
        setImage(image);
    }

    public void act() 
    {
        //         if(Greenfoot.mousePressed(this)) { highlight(); }
    } 

    public boolean isChipOnIt(Chip chip)
    {
        if ( intersects(chip) ) return true ;
        else return false;
    }

    public boolean isChipOnItTwo(ChipTwo chip2)
    {
        if ( intersects(chip2) ) return true ;
        else return false;
    }

    public void update(List<Dice> dicelist,List<SicBoTiles> list)
    {
        //World world;
        //world = getWorld();
        //List<Dice> dicelist = world.getObjects(Dice.class);
        int sumOfDice = dicelist.get(0).faceValue + dicelist.get(1).faceValue + dicelist.get(2).faceValue;
        if(dicelist.get(0).faceValue==dicelist.get(1).faceValue && dicelist.get(0).faceValue==dicelist.get(2).faceValue)
        {
            selectTile("Triple",list);
        }

        if (sumOfDice > 3 && sumOfDice < 11) selectTile("Small",list);
        if (sumOfDice > 10 && sumOfDice < 18) selectTile("Big",list);
        if (sumOfDice != 3 && sumOfDice !=18) selectTile("Number_"+sumOfDice,list);
        int a[]=new int[3];
        a[0]=dicelist.get(0).faceValue;
        a[1]=dicelist.get(1).faceValue;
        a[2]=dicelist.get(2).faceValue;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        selectTile("Combo"+a[0]+"And"+a[1],list);
        selectTile("Combo"+a[1]+"And"+a[2],list);
        selectTile("Combo"+a[0]+"And"+a[2],list);

    }

    public void selectTile(String string,List<SicBoTiles> list)
    {
        World world;
        world = getWorld();
       // List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
        //List<ChipsOne> chiplist = world.getObjects(ChipsOne.class);
        //List<ChipsTwo> chiplist2 = world.getObjects(ChipsTwo.class);
        for (int i = 0; i <list.size() ; i++) /* System.out.println( list.get(i)); */
        {
            if((list.get(i).toString()).contains(string))
            { 
                list.get(i).highlight(); 
            }
        }

    }
}
