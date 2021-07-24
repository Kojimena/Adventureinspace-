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
    int score = 0; //el valor inicial del contador es 0
    public counter(){
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLUE, Color.WHITE));
    }
    public void YouWin()
    {
    // Si el score es ==5 llamamos a YouWin para que le muestre al usuario que ha ganado.
        if (score ==5)
    {
     getWorld().addObject (new YouWin(),600,500);
     Greenfoot.stop();
            }
    }
    public void act() //método de condiciones a cumplir
    {
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLUE, Color.WHITE));
        YouWin();
        
    }
    public void addscore(){ //método para aumentar los puntos
        score++;
    }
}
