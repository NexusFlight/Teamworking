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
        addObject(hero,600,400);
        
        Wall topWallLong = new Wall(getWidth(), 2);
        Wall bottomWallLong = new Wall(getWidth(), 2);
        Wall horLeftWall = new Wall(getWidth()/4, 2);
        Wall horRightWall = new Wall(getWidth()/4, 2);
        Wall horRightShortWall = new Wall(getWidth()/8, 2);
        Wall vertLeftLongWall = new Wall(2, getHeight()/2);
        Wall vertRightLongWall = new Wall(2, getHeight()/3);
        Wall vertRightShortTopWall = new Wall(2, getHeight()/6);
        Wall vertRightShortBottomWall = new Wall(2, getHeight()/6);
        Wall vertLeftShortWall = new Wall(2, getHeight()/6);
        
       
        addObject(topWallLong, getWidth()/2, 83);
        addObject(bottomWallLong, getWidth()/2, 424);
        addObject(horLeftWall, 302, 152);
        addObject(horRightWall, 723, 152);
        addObject(horRightShortWall, 655, 365);
        addObject(vertLeftLongWall, 437, 288);
        addObject(vertRightLongWall, 588, 253);
        addObject(vertRightShortTopWall, 849, 120);
        addObject(vertRightShortBottomWall, 659, 397);
        addObject(vertLeftShortWall, 177, 118);
        
        
        
    }
    
}
