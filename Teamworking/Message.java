import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    int timer = 150;
    Hero hero;
    public Message(String message,Hero hero){
        this.hero = hero;
        GreenfootImage img = new GreenfootImage(message, 15, Color.WHITE, Color.BLACK);
        setImage(img);
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(hero.getHeroX(), hero.getHeroY()-20);
        timer--;
        if(timer <= 0){
            getWorld().removeObject(this);
        }
    }    
}
