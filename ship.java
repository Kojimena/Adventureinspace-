import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{   

    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    
    public ship()
    {
        GreenfootImage ship= getImage();
        ship.scale(86,46);
        
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("up"))
            setDireccion(UP);
        if (Greenfoot.isKeyDown("down"))
            setDireccion(DOWN);
        if (Greenfoot.isKeyDown("left"))
            setDireccion(LEFT);
        if (Greenfoot.isKeyDown("right"))
            setDireccion(RIGHT);
        
    Actor ship;
    ship= getOneObjectAtOffset(0,0,personas.class);
    if (ship!=null){
        World space;
        space=getWorld();
        space myWorld = (space)getWorld();
        counter counter = myWorld.getCounter();
        counter.addscore();
        space.removeObject(ship);
        Greenfoot.playSound("thx.wav");
        

    }}
    public void setDireccion(int direccion)
    {
        switch (direccion){
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("space")){
            setLocation (getX(), getY()-10);
            
        }
        else {
            setLocation (getX(), getY()-1);
        }
        break; 
        case DOWN:
        setRotation(90);
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(), getY()+10);
            }else{
                setLocation(getX(),getY()+1);
            }
        break;
        case LEFT:
        setRotation(180);
            if (Greenfoot.isKeyDown("space")){
            setLocation(getX()-10,getY());
            }else{
                setLocation(getX()-1,getY());
            }
        break;
        case RIGHT:
        setRotation(0);
            if (Greenfoot.isKeyDown("space")){
            setLocation(getX()+10,getY());
            }else{
                setLocation(getX()+1,getY());
            }
                break;
    }   
}
}

    


