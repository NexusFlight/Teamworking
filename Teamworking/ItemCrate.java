import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Team A 
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
    }//end itemCrate

    public void destroyCrate(Hero hero){
        if(!isArmor){
            getWorld().addObject(potions[potionType], getX(), getY());
        }//end if
        else{
           hero.setArmor(); 
        }//end else

        getWorld().removeObject(this);
    }//end destroyCrate
}//end class
