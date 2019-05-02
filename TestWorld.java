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
        Enemy enemy = new Enemy(1,1, hero);
        Wall wall = new Wall(500,5);
        Wall wallTwo = new Wall(500,5);
        addObject(hero,300,200);
        addObject(enemy, 200,200);
        addObject(wall,250,45);
        addObject(wallTwo,250,250);
    }
    
    public void nextWorld(){
        Greenfoot.setWorld(new TestWorld2(hero));
    }
}
