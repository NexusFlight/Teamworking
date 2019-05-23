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
    boolean isArmor;
    private static Potion[] potions = {new Potion(0), new Potion(1)};
    public ItemCrate(boolean isArmor){
        this.isArmor = isArmor;
        if(!isArmor)
            potionType = Greenfoot.getRandomNumber(potions.length);
    }

    public void destroyCrate(Hero hero){
        if(!isArmor){
            getWorld().addObject(potions[potionType], getX(), getY());
        }
        else{
           hero.setArmor(); 
        }

        getWorld().removeObject(this);
    }
}
