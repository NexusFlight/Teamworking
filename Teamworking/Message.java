import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (your name) 
 */
public class Message extends Actor
{
    int timer = 150;
    Hero hero;
    public Message(String message,Hero hero){
        this.hero = hero;
        GreenfootImage img = new GreenfootImage(message, 15, Color.WHITE, Color.BLACK);
        setImage(img);
    }//end Message class

    public void act() 
    {
        setLocation(hero.getHeroX(), hero.getHeroY()-20);
        timer--;
        if(timer <= 0){
            getWorld().removeObject(this);
        }//end if
    } //end act
}//end class
