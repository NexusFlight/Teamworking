import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Team A
 */
public class Wall extends Actor
{
    //Code in wall class    
    public Wall (int width, int height){
        GreenfootImage wall = getImage();
        wall.scale(width, height);
        setImage(wall);
    }//end Wall
}//end class
