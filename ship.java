import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{   
    //Serie de variables para el cambio de dirección
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    
    public ship()
    {//Constructor de la nave y su forma a escala
        GreenfootImage ship= getImage();
        ship.scale(86,46);
        
    }
    public void act()
    { //Comandos de movimiento hacer la función dada seDireccion
        if (Greenfoot.isKeyDown("up"))
            setDireccion(UP);
        if (Greenfoot.isKeyDown("down"))
            setDireccion(DOWN);
        if (Greenfoot.isKeyDown("left"))
            setDireccion(LEFT);
        if (Greenfoot.isKeyDown("right"))
            setDireccion(RIGHT);
        
    Actor ship; 
    ship= getOneObjectAtOffset(0,0,personas.class); //Se crea la variable ship y si se intersecta con personas debe pasar lo siguiente
    if (ship!=null){//si es diferente a null significa que algo choco con la ship
        World space;
        space=getWorld();// variable tipo espacio
        space myWorld = (space)getWorld();
        counter counter = myWorld.getCounter(); //obtenemos contador con un get
        counter.addscore(); //si la nave logra salvar a los ciudadanos se agrega un punto con addscore()
        space.removeObject(ship); // la nave hace que se desaparezca el objeto personas, remueve el objeto
        Greenfoot.playSound("thx.wav"); //Al desaparecer suena un "thank you" de respuesta, que es un sonido incorporado
        

    }}
    public void setDireccion(int direccion)
    {//método de movimiento de la nave
        switch (direccion){
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("space")){ //Al presionar la barra espaciadora la velocidad aumenta sino se queda normal.
            setLocation (getX(), getY()-10);
            
        }
        else {
            setLocation (getX(), getY()-1);
        }
        break; 
        case DOWN:
        setRotation(90);
            if(Greenfoot.isKeyDown("space")){//Al presionar la barra espaciadora la velocidad aumenta sino se queda normal.
                setLocation(getX(), getY()+10);
            }else{
                setLocation(getX(),getY()+1);
            }
        break;
        case LEFT:
        setRotation(180);
            if (Greenfoot.isKeyDown("space")){//Al presionar la barra espaciadora la velocidad aumenta sino se queda normal.
            setLocation(getX()-10,getY());
            }else{
                setLocation(getX()-1,getY());
            }
        break;
        case RIGHT:
        setRotation(0);
            if (Greenfoot.isKeyDown("space")){//Al presionar la barra espaciadora la velocidad aumenta sino se queda normal.
            setLocation(getX()+10,getY());
            }else{
                setLocation(getX()+1,getY());
            }
                break;
    }   
}
}

    


