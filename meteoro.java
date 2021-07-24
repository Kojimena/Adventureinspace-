import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteoro extends Actor
{
    /**
     * Act - do whatever the meteoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public meteoro()
    {
        GreenfootImage meteoro= getImage();
        meteoro.scale(86,64);
        
}
    public void act()
    {
        move(2);
        if((Greenfoot.getRandomNumber(100)>10)){
            turn(Greenfoot.getRandomNumber(90)-45);
        if (getX() <= 5|| getX()>= getWorld().getWidth()-5){
            turn (180);
            }
        if (getY() <= 5|| getY()>= getWorld().getWidth()-5){
            turn (180);
        }
    }
    Actor meteoro;
    meteoro= getOneObjectAtOffset(0,0,ship.class);
    if (meteoro!=null){
        World space;
        space=getWorld();
        space.removeObject(meteoro);
        Greenfoot.delay(10);
        Greenfoot.setWorld(new gameo());
    }
    
}
}
