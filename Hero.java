import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int speed = 3;
    private int x;
    private int y;
    public Hero(){
     GreenfootImage img = getImage();
     img.scale(25, 26);
     setImage(img);
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollison();
        updatePosition();
        move();   
    }  
    
    private void checkCollison(){
        int prevX = x;
        int prevY = y;
        if(isTouching(Wall.class)){
         setLocation(prevX,prevY);  
        }
        if(isTouching(Portal.class)){
            TestWorld world = (TestWorld)getWorld();
            world.transitionWorld(this);
        }
    }
    
    private void updatePosition(){
        this.x = getX();
        this.y = getY();
    }
    
    private void move(){
     if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
        setLocation(x,y-speed);
        }else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(x,y+speed);
        }else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(x-speed,y);
        }else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(x+speed,y);
        }
   }
}
