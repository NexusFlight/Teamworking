import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LargePotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potion extends Actor
{
    int additionalHP = 0;
    public Potion(int type){
        if(type == 0){
            GreenfootImage img = new GreenfootImage("redPotionSmall.png");
            img.scale(12,14);
            setImage(img);
            additionalHP = 10;
        }else{
            GreenfootImage img = getImage();
            img.scale(12,14);
            setImage(img);
            additionalHP = 25;
        }
        
    }
   
    public void act(){
        if(additionalHP == 0){
            getWorld().removeObject(this);
        }
    }
    
    public int getHP(){
        int hp = additionalHP;
        additionalHP = 0;
        return hp;
    }
}
