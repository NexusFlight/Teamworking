import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld extends greenfoot.World
{
    private Hero hero;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TestWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObjects();
    }
    
    protected void addObjects(){
        hero = new Hero();
        addObject(hero,300,300);
    }
    
    public void nextWorld(){
        Greenfoot.setWorld(new TestWorld2(hero));
    }
}
