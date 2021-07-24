import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{        counter counter= new counter();

    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1240, 920, 1); 
        prepare();
    }
    public counter getCounter(){
        return counter;
    }
    public void prepare(){
        ship ship1= new ship();
        addObject(ship1,50,300);
        crearmeteoros(10);
        crearpersonas(8);
        
        addObject(counter, 75,56);
    }
    public void crearmeteoros(int numero){
    for (int i=0; i<numero;i++){
        meteoro r=new meteoro();
        int x=Greenfoot.getRandomNumber(getWidth());
        int y=Greenfoot.getRandomNumber(getHeight());
        addObject (r, x, y);
    }}
    
    public void crearpersonas(int numero){
    for (int i=0; i<numero;i++){
        personas p=new personas();
        int x=Greenfoot.getRandomNumber(getWidth());
        int y=Greenfoot.getRandomNumber(getHeight());
        addObject (p, x, y);
    }}
    
    public void act(){
    }
    }
