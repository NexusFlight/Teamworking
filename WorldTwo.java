import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwo extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class WorldTwo.
     * 
     */
    public WorldTwo(Hero hero,int xSize, int ySize)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(xSize, ySize, 1); 
        this.hero = hero;
    }
}
