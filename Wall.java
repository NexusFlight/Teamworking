import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    //Code in wall class    
    public Wall (int width, int height){
        GreenfootImage wall = getImage();
        wall.scale(width, height);
        setImage(wall);
    }
}
