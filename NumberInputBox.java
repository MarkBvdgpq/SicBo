import greenfoot.*;
import java.awt.Color;

public class NumberInputBox extends Actor
{
    static int  inputValue = 0;
    String text = "";
    
    public NumberInputBox()
    {
        updateImage();
    }
    
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(150, 30);
        image.setColor(new Color(128, 0, 0));
        image.fill();
        image.setColor(Color.white);
        image.fillRect(3, 3, 144, 24);
        GreenfootImage numImage = new GreenfootImage(" " + text + " ", 24, Color.black, Color.white);
        image.drawImage(numImage, 75 - numImage.getWidth() / 2, 15 - numImage.getHeight() / 2);
        setImage(image);
    }

    public void act()
    {
        String key = Greenfoot.getKey();
        if (key == null) return;
        if ("-".equals(key) && text.length() == 0)
        {
            text = "-";
            updateImage();
        }
        if ("0123456789".indexOf(key) > -1 && text.length() < 10)
        {
            text += key;
            updateImage();
        }
        if ("backspace".equals(key) && text.length() > 0)
        {
            text = text.substring(0, text.length() - 1);
            updateImage();
        }
        if ("enter".equals(key) && (text.length() > 1 || (text.length() > 0 && text.charAt(0) != '-')))
        {
            inputValue = Integer.valueOf(text);
        }
    }
}
