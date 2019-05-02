import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wall (int width, int height){
        GreenfootImage wall = getImage();
        wall.scale(width, height);
        setImage(wall);
    }
    public void act() 
    {
        // Add your action code here.
    }   
}
