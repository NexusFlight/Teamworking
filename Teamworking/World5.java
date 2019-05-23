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
        bg("bossTest.png");
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
        
        Wall topWall = new Wall(getWidth(), 2);
        Wall pillerOne = new Wall(10, 24);
        Wall pillerTwo = new Wall(10, 24);
        Wall pillerThree = new Wall(10, 24);
        Wall pillerFour = new Wall(10, 24);
        Wall pillerFive = new Wall(10, 24);
        Wall pillerSix= new Wall(10, 24);
        Wall pillerSeven = new Wall(10, 24);
        Wall pillerEight = new Wall(10, 24);
        Wall pillerNine = new Wall(10, 24);
        Wall pillerTen = new Wall(10, 24);
        Wall pillerEleven = new Wall(10, 24);
        Wall pillerTwelve = new Wall(10, 24);
        
        addObject(topWall, 275, 25);
        addObject(pillerOne, 129, 50);
        addObject(pillerTwo, 431, 50);
        addObject(pillerThree, 130, 135);
        addObject(pillerFour, 431, 135);
        addObject(pillerFive, 235, 205);
        addObject(pillerSix, 321, 205);
        addObject(pillerSeven, 239, 295);
        addObject(pillerEight, 323, 295);
        addObject(pillerNine, 130, 390);
        addObject(pillerTen, 431, 390);
        addObject(pillerEleven, 17, 487);
        addObject(pillerTwelve, 551, 487);
    }
 
}