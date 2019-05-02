import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemCrate extends Actor
{
    int potionType = 0;
    private static Potion[] potions = {new Potion(0), new Potion(1)};
    public ItemCrate(){
        potionType = Greenfoot.getRandomNumber(potions.length);
    }
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void destroyCrate(){
        getWorld().addObject(potions[potionType], getX(), getY());
        getWorld().removeObject(this);
    }
}
