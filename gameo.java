import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameo extends World
{

    /**
     * Constructor for objects of class gameo.
     * 
     */
    public gameo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1240, 920, 1); 
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.BLACK);
        bg.fillRect(0,0,getWidth(),getHeight());
        setBackground(bg);
        Font f= new Font ("SansSerif",60);
        bg.setFont(f);
        bg.setColor(Color.RED);
        String message = "GAME OVER";
        bg.drawString(message, getWidth()/2 - message.length()*20,getHeight()/2);
        
    }
}
