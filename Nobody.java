/**
 * Write a description of class Nobody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nobody implements IPlayer
{
      private static boolean flag=false;
    public void status()
    {
        setFlag(true);
    }
    public static void setFlag(boolean f)
    {
        flag=f;
    }
    public static boolean getFlag()
    {
        return flag;
    }
    
}
