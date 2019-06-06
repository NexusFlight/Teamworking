import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This version of world updates the bg image and location of hero,
 * deletes existing actor classes other than hero and spawns new items.
 * This is an alternative to changing world subclass and passing hero.
 * 
 * @author Matt
 * @version 0.6
 */
public class WorldAlt extends World
{   
    private Hero hero = new Hero();
    private Portal portal = new Portal(10,100);   
    /**
     * Constructor for objects of class WorldAlt.
     */
    public WorldAlt()
    {   
        // Create standard world 1095x540 1x1 pixels
        super(1095,540,1);
        //spawn hero
        addObject(hero,450,450);
        //create portal
        addObject(portal,10,100);
        //update level (0 testworld, 1 start room)
        updateLevel(1);
    }
    
    public int getRandomNumber(int start,int stop)
    {
       return start + Greenfoot.getRandomNumber(stop-start+1);
    }    

    private void setBgImage(String bgImage){
        //sets background to bgImage
        GreenfootImage background = new GreenfootImage(bgImage);
        //scales background based on super (prevents tiling)
        background.scale(getWidth(), getHeight());
        //applies scaled background image to world
        setBackground(background);
    }
    
    public void setLevel(int level){
        //changes level for use with portal collision in hero
        updateLevel(level);
    }
    
    private int rng(int start,int end)
    {      
       return start + Greenfoot.getRandomNumber(end-start+1);
    }
    
    private void addEnemys () {
        
    }
    
    protected void updateLevel(int level){
        //remove all objects other than hero and portal
        removeObjects(getObjects(ItemCrate.class));
        removeObjects(getObjects(Potion.class));
        removeObjects(getObjects(Enemy.class));     
        removeObjects(getObjects(Wall.class));
        //alternatively also delete portals and create new portals as required
        if (level == 0){//test world
            hero.setLocation (450,450);
            portal.setLocation (10,100);
            setBgImage("TestWorld1.png");
        }
        if (level == 1){//1st room
            hero.setLocation (1027,449);
            portal.setLocation (10,100);
            setBgImage("world1.png");
            //add itemc crates
            addObject(new ItemCrate(false), 100,400);
            addObject(new ItemCrate(false), 900,200);
            addObject(new ItemCrate(false), 200,300);
            addObject(new ItemCrate(false), 600,400);
            addObject(new ItemCrate(false), 400,400);
            addObject(new ItemCrate(false), 900,400);
            addObject(new ItemCrate(false), 300,100);
            addObject(new ItemCrate(false), 900,100);
            //add walls
            Wall vertWallLeftLong = new Wall(2, 360);
            Wall topWall = new Wall (getWidth(), 2);
            Wall horWallLeftShort = new Wall (100, 2);
            Wall bottomWall = new Wall (getWidth(), 2);
            Wall horWallRightShort = new Wall (120, 2);
            Wall vertWallRight = new Wall(2, 400);
            
            addObject(topWall, getWidth()/2, 60);
            addObject(vertWallLeftLong, 69, 310);
            addObject(horWallLeftShort, 17, 131);
            addObject(bottomWall, getWidth()/2, 478);
            addObject(horWallRightShort, 1040, 403);
            addObject(vertWallRight,978, 203);
            //add enemy
            addObject(new Enemy(1, hero), 200,200);
            addObject(new Enemy(1, hero), 300,300);
            addObject(new Enemy(1, hero), 400,400);
        }
        if (level == 2){//2nd room 1st time
            hero.setLocation (600,400);
            portal.setLocation (200,110);
            setBgImage("world2DoorClosed.png");
            //add items
            addObject(new ItemCrate(false), 514,336);
            addObject(new ItemCrate(false), 719,132);
            addObject(new ItemCrate(false), 323,130);
            //add walls
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
            //add enemy
            addObject(new Enemy(2, hero), 510,170);
            addObject(new Enemy(2, hero), 790,130);
            addObject(new Enemy(2, hero), 230,130);
        }
        if (level == 3){//3rd room
            hero.setLocation (1000,280);
            portal.setLocation (1052,200);
            setBgImage("world3.png");
            //add items
            addObject(new ItemCrate(false), 711,152);
            addObject(new ItemCrate(false), 826,407);
            addObject(new ItemCrate(true), 323,130);
            //add walls
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
            //add enemy
            addObject(new Enemy(3, hero), 157,180);
            addObject(new Enemy(3, hero), 512,273);
            addObject(new Enemy(3, hero), 265,393);
        }
        if (level == 4){//2nd room 2nd time
            hero.setLocation(220,120);
            portal.setLocation(830,120);
            setBgImage("world2DoorClosed.png");
            //add items
            //TODO
            //add walls (same as level 2)
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
            //add enemy
            addObject(new Enemy(3, hero), 510,170);
            addObject(new Enemy(3, hero), 790,130);
            addObject(new Enemy(3, hero), 512,331);
        }
        if (level == 5){//4th room
            hero.setLocation(100,100);
            portal.setLocation(10,100);
            setBgImage("world4.png");
            //add items
            addObject(new ItemCrate(false), 116,135);
            addObject(new ItemCrate(false), 146,135);
            addObject(new ItemCrate(false), 166,135);
            addObject(new ItemCrate(false), 315,462);
            addObject(new ItemCrate(false), 500,450);
            addObject(new ItemCrate(false), 700,450);
            addObject(new ItemCrate(false), 800,450);
            addObject(new ItemCrate(false), 900,300);
            addObject(new ItemCrate(false), 800,300);
            addObject(new ItemCrate(false), 900,250);
            addObject(new ItemCrate(false), 850,300);
            addObject(new ItemCrate(false), 700,300);
            
            //add walls
            Wall vertWallOne = new Wall(2, 60);
            Wall vertWallTwo = new Wall(2, 60);
            Wall vertWallThree = new Wall(2, 190);
            Wall vertWallFour = new Wall(2, 190);
            Wall vertWallFive = new Wall(2, 190);
            Wall vertWallSix = new Wall(2, 190);
            Wall vertWallSeven = new Wall(2, 360);
            Wall vertWallEight = new Wall(2, 390);
            Wall vertWallNine = new Wall(2, 50);
            Wall vertWallTen = new Wall(2, 50);
            Wall vertWallEleven = new Wall(2, 50);
            Wall vertWallTwelve = new Wall(2, 250);
            Wall vertWallThirteen = new Wall(2, 250);
            
            Wall horWallOne = new Wall(700,2);//done
            Wall horWallTwo = new Wall(150,2);//done
            Wall horWallThree = new Wall(65,2);//done
            Wall horWallFour = new Wall(200,2);//done
            Wall horWallFive = new Wall(155,2);//done
            Wall horWallSix = new Wall(150,2);//done
            Wall horWallSeven = new Wall(100,2);//done
            Wall horWallEight = new Wall(100,2);//done
            Wall horWallNine = new Wall(120,2);//done
            Wall horWallTen = new Wall(120,2);//done
            Wall horWallEleven = new Wall(275,2);//done
            Wall horWallTwelve = new Wall(295,2);//done
            Wall horWallThirteen = new Wall(420,2);//done
            
            addObject(horWallOne,301,48);//done
            addObject(horWallTwo,17,124);//done
            addObject(horWallThree,223,124);//done
            addObject(horWallFour,138,152);//done
            addObject(horWallFive,403,227);//done
            addObject(horWallSix,303,304);//done
            addObject(horWallSeven,328,343);//done
            addObject(horWallEight,496,343);//done
            addObject(horWallNine,505,304);//done
            addObject(horWallTen,614,147);//done
            addObject(horWallEleven,412,491);//done
            addObject(horWallTwelve,825,487);//done
            addObject(horWallThirteen,761,84);//done
            
            addObject(vertWallOne, 92, 153);
            addObject(vertWallTwo, 192, 153);
            addObject(vertWallThree, 257, 219);
            addObject(vertWallFour, 327, 136);
            addObject(vertWallFive, 481, 136);
            addObject(vertWallSix, 552, 241);
            addObject(vertWallSeven, 677, 327);
            addObject(vertWallEight, 970, 291);
            addObject(vertWallNine, 551, 68);
            addObject(vertWallTen, 382, 328);
            addObject(vertWallEleven, 441, 328);
            addObject(vertWallTwelve, 280, 458);
            addObject(vertWallThirteen, 543, 458);
            //add enemy
            addObject(new Enemy(4, hero), 405,421);
            addObject(new Enemy(4, hero), 764,199);
            addObject(new Enemy(4, hero), 904,414);
        }
        if (level == 6){// 2nd room 3rd time OPENDOOR
            hero.setLocation(793,126);
            portal.setLocation(515,50);
            setBgImage("world2DoorOpen.png");
            //add item
            //TODO
            //add wall (same as level 2 with gap for door)
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
            //add enemy            
            addObject(new Enemy(4, hero), 604,406);
            addObject(new Enemy(4, hero), 220,124);
        }
        if (level == 7){// create new world for boss room (required to change super())
            Greenfoot.setWorld(new World5(hero));
        }       
    }
}