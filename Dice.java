import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice extends Actor implements ISubject
{
    int faceValue = 0;
    static int counter=0;
    static int score,score2;
    IObserver iobserver;
    static int pScoreOne,pScoreTwo=0;
    
    public void addObserver(IObserver io)
    {
        this.iobserver=io;
    }
    
    public void notifyObserver(List<Dice> dicelist,List<SicBoTiles> list)
    {
        iobserver.update(dicelist,list);
    }
    
    public void Dice() 
    {
        setFace();
        
    }
    public void check()
    {
      if(counter>0&&!Greenfoot.isKeyDown("space"))
        {
            counter=0;
            Chip.cFlag=false;
            ChipTwo.cFlag=false;
            ScoreBoard.val=true;
            List<Score> scoreList=getWorld().getObjects(Score.class);
            for(int i=0;i<scoreList.size();i++){getWorld().removeObject(scoreList.get(i));}
            calculate();
        }  
    }
    public void act() 
    {
        roll();
        
    }
    public void roll()
    {
   
    if (Greenfoot.isKeyDown("space"))
         { 
            World world; world = getWorld(); int i = 0;
            Chip.cFlag=false;
            Chip.cFlag=false;
            List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
            for ( i = 0; i <list.size() ; i++) list.get(i).reset();
            int rolls = Greenfoot.getRandomNumber(20);
            while (rolls > 0 )
            {
              setFace();
              rolls--;
            }
            counter++;
            }
     else
     {
         check();
        }
    }

   public void setFace()
   {
    int xx = Greenfoot.getRandomNumber(7);
    if(faceValue == 0)
             {
               faceValue = 6;
               
             }
             
    if (xx == 1)
             {
               setImage("DiceOne.PNG");
               faceValue = 1;
               }
    if (xx == 2)
              {
               setImage("DiceTwo.PNG");
               faceValue = 2;
            }
    if (xx == 3)
             {
               setImage("DiceThree.PNG");
               faceValue = 3;
            }
    if (xx == 4)
            {
               setImage("DiceFour.PNG");
               faceValue = 4;
            }
    if (xx == 5)
             {
               setImage("DiceFive.PNG");
               faceValue = 5;
            }
    if (xx == 6)
             {
               setImage("DiceSix.PNG");
               faceValue = 6;
              }
    }
    
    public void calculate()
    {
            score=0;
            score2=0;
            World world;
            world = getWorld();
            List<Dice> dicelist = world.getObjects(Dice.class);
            int sumOfDice = dicelist.get(0).faceValue + dicelist.get(1).faceValue + dicelist.get(2).faceValue;
            if(dicelist.get(0).faceValue==dicelist.get(1).faceValue && dicelist.get(0).faceValue==dicelist.get(2).faceValue)
            {
                selectTile("Triple");
            }
                    List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
            this.notifyObserver(dicelist,list);
            if (sumOfDice > 3 && sumOfDice < 11) selectTile("Small");
            if (sumOfDice > 10 && sumOfDice < 18) selectTile("Big");
            if (sumOfDice != 3 && sumOfDice !=18) selectTile("Number_"+sumOfDice);
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
            selectTile("Combo"+a[0]+"And"+a[1]);
            selectTile("Combo"+a[1]+"And"+a[2]);
            selectTile("Combo"+a[0]+"And"+a[2]);         
            pScoreOne=pScoreOne+score;
            pScoreTwo=pScoreTwo+score2;
    }
    
     public void selectTile(String string)
    {
        World world;
        world = getWorld();
        List<SicBoTiles> list = world.getObjects(SicBoTiles.class);
        List<Chip> chiplist = world.getObjects(Chip.class);
        List<ChipTwo> chiplist2 = world.getObjects(ChipTwo.class);
        
        for (int i = 0; i <list.size() ; i++) /* System.out.println( list.get(i)); */
        {
            if((list.get(i).toString()).contains(string))
            { 
                list.get(i).highlight(); 
                for (int j = 0; j <chiplist.size() ; j++) 
                {
                    if(list.get(i).isChipOnIt(chiplist.get(j)))
                    {
                        score = score + chiplist.get(j).value * list.get(i).factor;
                    }
                }
                for (int j = 0; j <chiplist2.size() ; j++) 
                {
                    if(list.get(i).isChipOnItTwo(chiplist2.get(j)))
                    {
                        score2 = score2 + chiplist2.get(j).value * list.get(i).factor;
                    }
                }
            }
        }
    }
    
    public static int getS1()
    {
        return score;
    }
    
    public static int getS2()
    {
        return score2;
    }
}
