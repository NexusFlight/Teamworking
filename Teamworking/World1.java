import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095,540,1);       
        bg("world1.png"); 
        hero = new Hero();
        addObjects();
    }
    public World1(Hero hero)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095,540,1);       
        bg("world1.png"); 
        
    }   
    public void setHero(Hero hero)
    {
        this.hero = hero;
        addObjects();
    }
    
    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    protected void addObjects(){
        
        
        Portal portal = new Portal(new World2());
        
        Wall vertWallLeftLong = new Wall(2, 360);
        Wall topWall = new Wall (getWidth(), 2);
        Wall horWallLeftShort = new Wall (100, 2);
        Wall bottomWall = new Wall (getWidth(), 2);
        Wall horWallRightShort = new Wall (120, 2);
        Wall vertWallRight = new Wall(2, 400);
        
        addObject(portal,10,100);
        addObject(hero,450,450);
        addObject(topWall, getWidth()/2, 60);
        addObject(vertWallLeftLong, 69, 310);
        addObject(horWallLeftShort, 17, 131);
        addObject(bottomWall, getWidth()/2, 478);
        addObject(horWallRightShort, 1040, 403);
        addObject(vertWallRight,978, 203);
    }

}
