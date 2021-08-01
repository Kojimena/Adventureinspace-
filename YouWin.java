import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends Actor
{
    /**
     * Act - do whatever the YouWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public YouWin(){
    setImage(new GreenfootImage("YOU WON!!!", 100, Color.BLUE, Color.WHITE));
    Greenfoot.playSound("star-wars-theme-song.mp3");
    }
    public void act()
    {
        // Add your action code here.
    }
}
