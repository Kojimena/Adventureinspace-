import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public counter(){
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLUE, Color.WHITE));
    }
    public void YouWin()
    {
    if (score ==5)
    {
     getWorld().addObject (new YouWin(),600,500);
     Greenfoot.stop();
            }
    }
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLUE, Color.WHITE));
        YouWin();
        
    }
    public void addscore(){
        score++;
    }
}
