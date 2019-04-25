import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Hero hero)
    {
        super(1095,540,1);
        bg("world4.png");
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
        Greenfoot.setWorld(new World5(hero));
    }
}
