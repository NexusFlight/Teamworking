import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{    
    public Portal(int width, int height){
        GreenfootImage portal = getImage();
        portal.scale(width, height);
        setImage(portal);
    }
}