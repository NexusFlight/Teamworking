import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author Team A
 */
public class Hero extends Actor
{
    private int speed = 3;
    private int x;
    private int y;
    private int timer = 10;
    private boolean timerRunning = false;
    private String lastKey = "";
    private GreenfootImage img;
    private GreenfootImage atkImg = new GreenfootImage("heroRightAttack.png");
    private boolean facingLeft = true;
    private boolean atkLeft = true;
    private boolean doesDamage = false;
    private int heroHealth = 100;
    private int heroDamage = 5;
    private int mobDamage, mobX, mobY;
    private Enemy enemy;
    private boolean hasTakenDamage = false;
    private int damageRecovery = 0;
    private int worldTrack = 0;
    private boolean hasArmor = false;
    public Hero(){
        img = getImage();
        img.scale(25, 26);
        atkImg.scale(50,25);
        setImage(img);
    }//end Hero

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        damageRecovery--;
        checkCollison();
        updatePosition();
        move(); 
        attack();
    }//end act
    public void setArmor(){
        hasArmor = true;
        getWorld().addObject(new Message("You now have Armor!!",this), x, y - 20);
        heroHealth = 150;
    }//end setArmour
    
    private void checkCollison(){
        int prevX = x;
        int prevY = y;
        if(isTouching(Wall.class)){
            setLocation(prevX,prevY);  
        }//end if
        if(isTouching(Portal.class)){
            Portal portal = (Portal)getOneIntersectingObject(Portal.class);
            portal.transitionWorld(this);
        }//end if
        if(isTouching(Potion.class) && !timerRunning){
            Potion potion = (Potion)getOneIntersectingObject(Potion.class);
            int addHP = potion.getHP();
            if(addHP + heroHealth > 100 && !hasArmor){
                heroHealth = 100;
            }//end elseif
            else if(addHP + heroHealth > 150 && hasArmor){
                heroHealth = 150;
            }//end else if
            else{
                heroHealth += addHP;
            }//end else
        }//end if
        if(isTouching(ItemCrate.class)){
            ItemCrate crate = (ItemCrate)getOneIntersectingObject(ItemCrate.class);
            if(timerRunning){
                crate.destroyCrate(this);
            }//end if
        }//end if
        if(isTouching(Enemy.class)){
            enemy = (Enemy)getOneIntersectingObject(Enemy.class);
            if(timerRunning)
            {
                //do damage dont take damage
                if(hasTakenDamage == false)
                {//if the enemy has taken damage then dont allow it to take multiple damage at one time
                    enemy.takeDamage(heroDamage,this);
                }
                hasTakenDamage = true;
            }//end if
            else
            {
                if(damageRecovery < 1)
                {
                    //take damage
                    mobDamage = enemy.getDamage();
                    takeDamage(mobDamage);                   
                    mobX = enemy.getEnemyX();
                    if(x < mobX)
                    {//knockback statements for the player.
                        setLocation(mobX-35,y);
                    }//end 
                    else
                    {
                        setLocation(mobX+35,y);
                    }
                    damageRecovery = 30;
                }//end if
            }//end else
        }//end if
        if(!timerRunning && enemy != null)
        {
            enemy.setMoveDir(2);
        }//end if
    }//end checkCollision

    private void updatePosition(){
        this.x = getX();
        this.y = getY();
    }//end updatePosition

    private void flipImage(){
        img.mirrorHorizontally();
        setImage(img);
    }//end flipImage

    private void flipImage(GreenfootImage image)
    {
        image.mirrorHorizontally();
        setImage(image);
    }//end flipImage

    private void move(){
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(x,y-speed);
        }//end if
        else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(x,y+speed);
        }//end else if
        else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(x-speed,y);
            if(!facingLeft){
                flipImage();
                facingLeft = !facingLeft;
            }//end if
        }//end else if
        else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(x+speed,y);
            if(facingLeft){
                flipImage();
                facingLeft = !facingLeft;
                lastKey = "d";
            }//end if
        }//end else if
    }//end move

    private void attack()
    {   //Rusty sword = 5 damage
        if(Greenfoot.isKeyDown(" "))
        {
            doesDamage = true;
            timerRunning = true;
            if(!facingLeft && !atkLeft)
            {
                flipImage(atkImg);
                atkLeft = true;
                setLocation(x+25,y);
            }//end if
            else if(facingLeft && atkLeft)
            {
                flipImage(atkImg);
                atkLeft = false;
                setLocation(x-25,y);
            }//end if
            else
            {
                setImage(atkImg);
            }//end else
        }//end if
        if(timerRunning)
        {
            timer--;  
        } //end if
        if(timer == 0)
        {
            setLocation(x,y);
            img.scale(25, 26);
            setImage(img);
            timerRunning = false;
            doesDamage = false;
            hasTakenDamage = false;
            timer = 20;
        }
    }//end if

    public void takeDamage(int damage)
    {   //user mobDamag as its parameter which is deducted from player health
        heroHealth -= damage;
    }//end takeDamage

    public int getHeroX()
    {
        return getX();
    }//end getHeroX

    public int getHeroY()
    {
        return getY();
    }//end getHeroY

    public int getHeroDamage()
    {
        return heroDamage;
    }//end getHeroDamage
}//end class
