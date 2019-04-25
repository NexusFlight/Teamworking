import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095,540,1);       
        bg("world1.png"); 
        addObjects();
    }

    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    protected void addObjects(){
        hero = new Hero();
        addObject(hero,450,450);
    }
    
    public void nextWorld(){
        Greenfoot.setWorld(new World2(hero));
    }
}
