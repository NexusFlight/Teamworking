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
    private Portal portal;
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        this(new Hero());
    }
    
    public World1(Hero hero)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095,540,1);       
        bg("world1.png"); 
        this.hero = hero;
        addObjects();
    }   
    
    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    private int rng(int start,int end)
    {      
       return start + Greenfoot.getRandomNumber(end-start+1);
    }
    
    private void addEnemy(int minX, int maxX, int minY, int maxY) {
        //TODO
        do {
        int x = rng(minX,maxX);
        int y = rng(minY,maxY);
        } while (true);
    }
    
    protected void addObjects(){     
        
        addEnemys();
        addCrates();
        //add hero
        addObject(hero,1031,444);      
        //create walls
        Wall vertWallLeftLong = new Wall(2, 360);
        Wall topWall = new Wall (getWidth(), 2);
        Wall horWallLeftShort = new Wall (100, 2);
        Wall bottomWall = new Wall (getWidth(), 2);
        Wall horWallRightShort = new Wall (120, 2);
        Wall vertWallRight = new Wall(2, 400);
        //add walls
        addObject(topWall, getWidth()/2, 60);
        addObject(vertWallLeftLong, 69, 310);
        addObject(horWallLeftShort, 17, 131);
        addObject(bottomWall, getWidth()/2, 478);
        addObject(horWallRightShort, 1040, 403);
        addObject(vertWallRight,978, 203);
    }
    protected void addEnemys(){
        //add enemy
        addObject(new Enemy(1, hero), 200,200);
        addObject(new Enemy(1, hero), 300,300);
        addObject(new Enemy(1, hero), 400,400);
    }
    protected void addCrates(){        
        //add itemc crates
        addObject(new ItemCrate(false), 100,400);
        addObject(new ItemCrate(false), 900,200);
        addObject(new ItemCrate(false), 200,300);
        addObject(new ItemCrate(false), 600,400);
        addObject(new ItemCrate(false), 400,400);
        addObject(new ItemCrate(false), 900,400);
        addObject(new ItemCrate(false), 300,100);
        addObject(new ItemCrate(false), 900,100);
    }

}
