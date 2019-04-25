import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class testWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld2 extends greenfoot.World
{
    private Hero hero;
    /**
     * Constructor for objects of class testWorld2.
     * 
     */
    public TestWorld2(Hero hero)
    {
        super(800,600,1);
        this.hero = hero;
        addObjects();
    }
    
    protected void addObjects(){
        addObject(hero,100,100);
    }
}
