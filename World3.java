import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3(Hero hero)
    {
        super(1095,540,1);
        bg("world3.png");
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
        Greenfoot.setWorld(new World4(hero));
    }
}
