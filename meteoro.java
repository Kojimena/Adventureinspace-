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
    //Este metodo es lo que el objeto estará haciendo mientras corre el programa
    {
        move(2);//cantidad de movimiento
        if((Greenfoot.getRandomNumber(100)>10)){
            turn(Greenfoot.getRandomNumber(90)-45); //Si el numero que genera es <90 va a pasar la condición
        if (getX() <= 5|| getX()>= getWorld().getWidth()-5){
            turn (180);
            }
        if (getY() <= 5|| getY()>= getWorld().getWidth()-5){
            turn (180);
        } //con los gets obtenemos las medidas para que las rocas no se salgan de la pantalla.
    }
    Actor meteoro;
    meteoro= getOneObjectAtOffset(0,0,ship.class);//creacion variable tipo objeto que al chocar con ship en 0,0 se ejecuta lo siguiente
    if (meteoro!=null){
        World space;
        space=getWorld();
        space.removeObject(meteoro);
        Greenfoot.delay(10);
        Greenfoot.setWorld(new gameo()); //si un meteorito logra destruir la nave se llama a gameo() que nos muestra un escenario de game over.
    }
    
}
}
