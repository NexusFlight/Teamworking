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
    private World3 worldThree;
    private World4 worldFour;
    /**
     * Constructor for objects of class testWorld2.
     * 
     */
    public World2()
    {
        super(1095,540,1);
        bg("world2.png");   
    }

    public void setHero(Hero hero){
        this.hero = hero;
        worldThree = new World3(this);
        worldFour = new World4(this);
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
        addEnemys();
        addCrates();
        //add hero
        addObject(hero,600,400);
        //creating portals
        Portal portal1 = new Portal(worldThree);
        Portal portal2 = new Portal(worldFour);
        Portal portal3 = new Portal(new World5());
        //add portals
        addObject(portal1,200,127);
        addObject(portal2,837,128);
        addObject(portal3,512,76);
        //create walls
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
        //add walls
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
    
    protected void addEnemys(){
        //add enemy
        addObject(new Enemy(2,2, hero), 510,170);
        addObject(new Enemy(2,2, hero), 790,130);
        addObject(new Enemy(2,2, hero), 230,130); 
    }
    
    protected void addCrates(){
        //add crates
        addObject(new ItemCrate(false), 514,336);
        addObject(new ItemCrate(false), 719,132);
        addObject(new ItemCrate(false), 323,130);
    }
    
}
