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
        // Constructor creación del mundo con sus dimensiones.
        super(1240, 920, 1); 
        prepare();
    }
    public counter getCounter(){
        // Uso de get para obtener la información del contador.
        return counter;
    }
    public void prepare(){
        // Constructor para la preparación de los elementos de espacio.
        ship ship1= new ship();
        addObject(ship1,50,300);
        crearmeteoros(10); //se crean objetos de tipo meteoro
        crearpersonas(10); //se crean objetos de tipo personas
        
        addObject(counter, 75,56);
    }
    //recibe como parametro variable entera, no regresa valores
    public void crearmeteoros(int numero){
    // Métodos para crear meteoros.
        for (int i=0; i<numero;i++){
        meteoro r=new meteoro();
        int x=Greenfoot.getRandomNumber(getWidth()); //getWidth nos da el valor del largo
        int y=Greenfoot.getRandomNumber(getHeight());//getWidth nos da el valor del ancho
        addObject (r, x, y);
    }}
    public void crearpersonas(int numero){
    // Métodos para crear personas.Recibe como parametro variable entera, no regresa valores
        for (int i=0; i<numero;i++){
        personas p=new personas();
        int x=Greenfoot.getRandomNumber(getWidth());
        int y=Greenfoot.getRandomNumber(getHeight());
        addObject (p, x, y);
    }}
    public void act(){
    }
    }
