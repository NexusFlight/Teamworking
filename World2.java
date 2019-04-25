import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class testWorld2.
     * 
     */
    public World2(Hero hero)
    {
        super(1095,540,1);
        bg("world2DoorClosed.png");
        this.hero = hero;
        addObjects();        
    }

    public void openDoor(){
        bg("world2DoorOpen.png");
    }
    
    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    protected void addObjects(){
        addObject(hero,450,450);
    }
    
    public void nextWorld(){
        Greenfoot.setWorld(new World3(hero));
    }
    
}
