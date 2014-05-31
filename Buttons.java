import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor implements IObserver_Buttons
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
     public void update()
	{
		/*World world;
        world = getWorld();
        List<Buttons> button_list = 
       
        for (int i = 0; i <button_list.size() ; i++) 
        {
            if((button_list.get(i).toString()).contains("Reset"))
            { 
				//Reset r = new Reset();
				*/
			    World world = getWorld();
				world.addObject(this, 1073, 824);
           // }
       // }
	}
}
