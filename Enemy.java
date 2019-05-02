import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    //move dir 1 up 2 down 3 left 4 right
    int moveDir;
    int moveSpd = 2;
    int mobType;
    int health;
    public Enemy(int moveDir, int worldNum){
        //skelly ghost elemental zombie masked slime demon
        GreenfootImage[] enemys = {new GreenfootImage("mobSkeletonRight.png"),new GreenfootImage("mobGhostRight.png"),new GreenfootImage("mobElementalRight.png"),new GreenfootImage("mobZombieRight.png"),new GreenfootImage("mobMaskedRight.png"),new GreenfootImage("mobSlimeRight.png"),new GreenfootImage("mobDemonLeft.png")};
        mobType = Greenfoot.getRandomNumber(enemys.length);
        GreenfootImage img = enemys[mobType];
        if(mobType != 6){
            img.scale(18,21);
        }else{
            img.scale(24,21);
        }
        setImage(img);
        this.moveDir = moveDir;
        health = (int)(((mobType+1)*5)*worldNum/1.5);

    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollison();
        move();
    }    

    private void checkCollison(){
        if(isTouching(Wall.class)){
            reverseMovement();
        }
    }

    private void reverseMovement(){
        if(moveDir == 1)
        {
            moveDir = 2;
        }
        else if(moveDir == 2)
        {
            moveDir = 1;
        }
        else if(moveDir == 3)
        {
            moveDir = 4;
        }
        else if(moveDir == 4)
        {
            moveDir = 3;
        }
    }

    public void move(){
        int x = getX();
        int y = getY();
        if(moveDir == 1)
        {
            setLocation(x,y-moveSpd);
        }
        else if(moveDir == 2)
        {
            setLocation(x,y+moveSpd);
        }
        else if(moveDir == 3)
        {
            setLocation(x-moveSpd,y);
        }
        else if(moveDir == 4)
        {
            setLocation(x+moveSpd,y);
        }
    }

    
    
    public void takeDamage(int damage){
        health -= damage;
    }
}
