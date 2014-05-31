import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import greenfoot.Actor.*;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor implements ISubject_ScoreBoard
{
    int score=0,score2=0;
    static boolean val=false;
    static boolean IFlag=false;
    static int pScoreOne=0;
    static int pScoreTwo=0;
    ICommand command;
    List<IObserver_Buttons> iObserverList;
    IPlayer p1=new PlayerOne();
    IPlayer p2=new PlayerTwo();
    IPlayer nb=new Nobody();
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScoreBoard()
    {
    }

    public ScoreBoard(ICommand command)
    {
        this.command=command;
    }
    
    public void setCommand(ICommand command)
    {
        this.command=command;
    }

    public ICommand getCommand()
    {
        return command;
    }

    public void act() 
    {
        if(val)
        { 

            if(Greenfoot.mouseClicked(this))
            {
                World world=getWorld();
                Score score1 = new Score();
                int s1=Dice.getS1();
                score1.displayOne(s1);
                world.addObject(score1,682,796);

                Score score2 = new Score();
                int s2= Dice.getS2();
                score2.displayTwo(s2);
                world.addObject(score2,682,824);
                
                if(s1>s2)
                {
                    Display display=new Display(p1);
                    setCommand(display);
                    command.execute();
                }
                else if(s2>s1)
                {
                    Display display=new Display(p2);
                    setCommand(display); 
                    command.execute();
                }
                else
                {
                    Display display=new Display(nb);
                    setCommand(display); 
                    command.execute();
                }

                if(PlayerOne.getFlag()==true)
                {
                    Score s = new Score();
                    s.displayPlayer1();
                    getWorld().addObject(s,682,859);
                    Greenfoot.playSound("Winning Sound.wav");
                    PlayerOne.setFlag(false);
                }
                if(PlayerTwo.getFlag()==true)
                {
                    Score s = new Score();
                    s.displayPlayer2();
                    getWorld().addObject(s,682,859);
                    Greenfoot.playSound("Winning Sound.wav");
                    PlayerTwo.setFlag(false);
                }
                if(Nobody.getFlag()==true)
                {
                    Score s = new Score();
                    s.displayEqual();
                    getWorld().addObject(s,682,859);
                    Greenfoot.playSound("Game_Over_Sound_Effect.mp3");
                    Nobody.setFlag(false);
                }
                Score sc1=new Score();
                Score sc2=new Score();
                sc1.displayTotalOne(Dice.pScoreOne);
                sc2.displayTotalTwo(Dice.pScoreTwo);
                getWorld().addObject(sc1,230,731);
                getWorld().addObject(sc2,1273,731);
                iObserverList = world.getObjects(Buttons.class);
                for(int i=0;i<iObserverList.size();i++);
                addObservers();
                Reset reset=new Reset();
                world.addObject(reset,412,859);
                QuitButton qb=new QuitButton();
                world.addObject(qb,950,859);
                Chip.cFlag=true; 
                ChipTwo.cFlag=true;
                val=false;
            }

        }
    }   

    public void addObservers()
    {
        World world = getWorld();
        iObserverList = world.getObjects(Buttons.class);

    }

    public void notifyObservers()
    {
        World world = getWorld();
        for(int i=0;i<iObserverList.size();i++)
            iObserverList.get(i).update();
    }

}
