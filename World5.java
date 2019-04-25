import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{

    private Hero hero;
    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5(Hero hero)
    {
        super(570,508,1);
        bg("bossRoom.png");
        this.hero = hero;
        addObjects();
    }

    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    protected void addObjects(){
        addObject(hero,100,100);
    }
    
    public void nextWorld(){
        
    }
}
