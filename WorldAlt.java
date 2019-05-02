import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This version of world updates the bg image and location of hero,
 * deletes existing actor classes other than hero and spawns new items.
 * This is an alternative to changing world subclass and passing hero.
 * 
 * @author Matt
 * @version 0.2
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
    
    protected void updateLevel(int level){
        //remove all objects other than hero and portal
        removeObjects(getObjects(Item.class));
        removeObjects(getObjects(Enemy.class));      
        //alternatively also delete portals and create new portals as required
        if (level == 0){//test world
            hero.setLocation (450,450);
            portal.setLocation (10,100);
            setBgImage("TestWorld1.png");
        }
        if (level == 1){//1st room
            hero.setLocation (450,450);
            portal.setLocation (10,100);
            setBgImage("world1.png");
            //add items
            //TODO
            //add walls
            //TODO         
            //add enemy
            //TODO 
        }
        if (level == 2){//2nd room 1st time
            hero.setLocation (600,400);
            portal.setLocation (200,100);
            setBgImage("world2DoorClosed.png");
            //add items
            //TODO
            //add walls
            //TODO
            //add enemy
            //TODO
        }
        if (level == 3){//3rd room
            hero.setLocation (1000,280);
            portal.setLocation (1052,200);
            setBgImage("world3.png");
            //add items
            //TODO
            //add walls
            //TODO
            //add enemy
            //TODO
        }
        if (level == 4){//2nd room 2nd time
            hero.setLocation(220,120);
            portal.setLocation(830,120);
            setBgImage("world2DoorClosed.png");
            //add items
            //TODO
            //add walls (same as level 2)
            //TODO
            //add enemy
            //TODO
        }
        if (level == 5){//4th room
            hero.setLocation(100,100);
            portal.setLocation(10,100);
            setBgImage("world4.png");
            //add items
            //TODO
            //add walls
            //TODO
            //add enemy
            //TODO
        }
        if (level == 6){// 2nd room 3rd time OPENDOOR
            hero.setLocation(800,140);
            portal.setLocation(515,50);
            setBgImage("world2DoorOpen.png");
            //add item
            //TODO
            //add wall (same as level 2 with gap for door)
            //TODO
            //add enemy
            //TODO
        }
        if (level == 7){// create new world for boss room (required to change super())
            Greenfoot.setWorld(new World5(hero));
        }       
    }
}
