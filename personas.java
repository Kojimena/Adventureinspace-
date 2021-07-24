import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personas extends Actor
{
    public personas()
    {
        GreenfootImage personas= getImage();
        personas.scale(86,50);
        
    }
    /**
     * Act - do whatever the personas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {}
    public void choque(){
        if (isTouching(ship.class)) {
        removeTouching(ship.class);
        //Greenfoot.playSoundç
        getWorld().addObject(new ship(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(10));
    }
    }
}
