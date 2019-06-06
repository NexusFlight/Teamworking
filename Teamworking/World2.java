import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Team A
 */
public class World2 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class testWorld2.
     * 
     */
    public World2()
    {
        super(1095,540,1);
        bg("world2.png");   
    }//end World2

    public void setHero(Hero hero){
        this.hero = hero;
        addObjects();     
    }//end setHero
    
    public void openDoor(){
        bg("world2DoorOpen.png");
    }//end openDoor
    
    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }//end bg
    
    protected void addObjects(){
        addEnemys();
        addCrates();
        //add hero
        addObject(hero,600,400);
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
    }//end addObjects
    
    protected void addEnemys(){
        //add enemy
        addObject(new Enemy(2, hero), 510,170);
        addObject(new Enemy(2, hero), 790,130);
        addObject(new Enemy(2, hero), 230,130); 
    }//end Enemys
    
    protected void addCrates(){
        //add crates
        addObject(new ItemCrate(false), 514,336);
        addObject(new ItemCrate(false), 719,132);
        addObject(new ItemCrate(false), 323,130);
    }//end addCrates
}//end class
