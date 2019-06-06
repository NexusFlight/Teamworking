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
    World2 world2;
    World3 world3;
    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3(Hero hero, World2 world2)
    {
        super(1095,540,1);
        this.world2 = world2;
        bg("world3.png");
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
        addEnemys();
        addCrates();
        //add hero
        addObject(hero,1050,253);
        //create walls
        Wall horTopWall = new Wall(getWidth(), 2);
        Wall horBottomWall = new Wall(getWidth(), 2);
        Wall horTopMidWall = new Wall(getWidth()/4, 2);
        Wall horBottomMidWall = new Wall(getWidth()/4, 2);
        Wall vertLeftWall = new Wall(2, getHeight());
        Wall vertMidTopLeftWall = new Wall(2, getHeight()/4);
        Wall vertMidBottomLeftWall = new Wall(2, getHeight()/4);
        Wall vertMidTopRightWall = new Wall(2, getHeight()/4);
        Wall vertMidBottomRightWall = new Wall(2, getHeight()/4);
        Wall vertRightTopWall = new Wall(2, getHeight()/2);
        Wall vertRightBottomWall = new Wall(2, getHeight()/2);
        Wall horTopRightWall = new Wall(getWidth()/7, 2);
        Wall horBottomRightWall = new Wall(getWidth()/7, 2);
        //add portal
        addObject(new Portal(world2),1000,240);
        //add walls
        addObject(horTopWall, getWidth()/2, 95);
        addObject(horBottomWall, getWidth()/2, 442);
        addObject(horTopMidWall, 532, 202);
        addObject(horBottomMidWall, 532, 318);
        addObject(vertLeftWall, 49, getHeight()/2);
        addObject(vertMidTopLeftWall, 389, 134);
        addObject(vertMidBottomLeftWall, 389, 385);
        addObject(vertMidTopRightWall, 676, 134);
        addObject(vertMidBottomRightWall, 676, 385);
        addObject(vertRightTopWall, 1015, 87);
        addObject(vertRightBottomWall, 1015, 429);
        addObject(horTopRightWall, 1093, 221);
        addObject(horBottomRightWall, 1093, 295);
    }
    
    protected void addEnemys(){
       //add enemy
        addObject(new Enemy(3, hero), 157,180);
        addObject(new Enemy(3, hero), 512,273);
        addObject(new Enemy(3, hero), 265,393);
    }
    
    protected void addCrates(){
        //add items
       addObject(new ItemCrate(false), 711,152);
       addObject(new ItemCrate(false), 826,407);
       addObject(new ItemCrate(true), 323,130);
    }

}
