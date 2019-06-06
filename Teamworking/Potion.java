import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Team A
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
        }//end if
        else{
            GreenfootImage img = getImage();
            img.scale(12,14);
            setImage(img);
            additionalHP = 25;
        }//end else
        
    }//end potion
   
    public void act(){
        if(additionalHP == 0){
            getWorld().removeObject(this);
        }//end if
    }//end act
    
    public int getHP(){
        int hp = additionalHP;
        additionalHP = 0;
        return hp;
    }//end getHP
}//emd class
