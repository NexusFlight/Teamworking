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
    int damage;
    int x,y;
    private Hero hero;
    int heroX, heroY;
    boolean canFollow = true;
    public Enemy(int moveDir, int worldNum, Hero hero){
        //skelly ghost elemental zombie masked slime demon
        this.hero = hero;
        GreenfootImage[] enemys = {new GreenfootImage("mobSkeletonRight.png"),new GreenfootImage("mobGhostRight.png"),new GreenfootImage("mobElementalRight.png"),new GreenfootImage("mobZombieRight.png"),new GreenfootImage("mobMaskedRight.png"),new GreenfootImage("mobSlimeRight.png"),new GreenfootImage("mobDemonLeft.png")};
        mobType = Greenfoot.getRandomNumber(enemys.length);
        GreenfootImage img = enemys[mobType];
        if(mobType != 6){
            img.scale(18,21);
        }else{
            img.scale(24,21);
        }//end else
        setImage(img);
        this.moveDir = moveDir;
        health = (int)(((mobType+1)*5)*worldNum/1.5);
        damage = (int)(((mobType+1)*2)*worldNum);
    }//end Enemy constructor

    public void act() 
    {
        updatePosition();
        checkCollison();
        followPlayer();
    }//end act

    private void updatePosition(){
        this.x = getX();
        this.y = getY();
    }//end updatePosition

    private void checkCollison()
    {
        int prevX = x;
        int prevY = y;
        if(isTouching(Wall.class))
        {
            canFollow = false;
            setLocation(prevX,prevY-1);
        }//end if
        else
        {
            canFollow = true;
        }//end else
    }//end checkCollision

//A function to have the enemies follow the player
    private void followPlayer()
    {
        if(canFollow == true){
            if(!getObjectsInRange(400,Hero.class).isEmpty())
            {
                hero = (Hero)getObjectsInRange(400,Hero.class).get(0);
                if(hero != null)
                {
                    turnTowards(hero.getHeroX(), hero.getHeroY());
                    move(2);
                    setRotation(0);
                }//end if
            }//end if
        }//end if
    }//end followPlayer

//A function to check if the enemy needs to change it's movement direction
    private void reverseMovement(){
        if(moveDir == 1)
        {
            moveDir = 2;
        }//end if
        else if(moveDir == 2)
        {
            moveDir = 1;
        }//end if
        else if(moveDir == 3)
        {
            moveDir = 4;
        }//end if
        else if(moveDir == 4)
        {
            moveDir = 3;
        }//end if
    }//end reverseMovement

    public void move(){
        x = getX();
        y = getY();
        if(moveDir == 1)
        {
            setLocation(x,y-moveSpd);
        }//end if
        else if(moveDir == 2)
        {
            setLocation(x,y+moveSpd);
        }//end else if
        else if(moveDir == 3)
        {
            setLocation(x-moveSpd,y);
        }//end else if
        else if(moveDir == 4)
        {
            setLocation(x+moveSpd,y);
        }//end else if
    }//end move 

    public void setMoveDir(int move)
    {
        this.moveSpd = move;
    }//end setMoveDir

    public void takeDamage(int damage, Hero hero){
        health -= damage;
        heroX = hero.getHeroX();
        if(x < heroX)
        {
            setLocation(x-25,y);
        }//end if
        else
        {
            setLocation(x+25,y);
        }//end else
        if(health == 0)
        {
            //This would be how an enemy would be killed
        }
    }

    public int getDamage()
    {
        return damage;
    }//end getDamage

    public int getEnemyX()
    {
        return getX();
    }//end getEnemyX

    public int getEnemyY()
    {
        return getY();
    }//end getEnemyY
}//end Enemy class
