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
    private int level = 1;
    public Hero(){
        img = getImage();
        img.scale(25, 26);
        atkImg.scale(50,25);
        setImage(img);
    }

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
    }  
    public void setArmor(){
        hasArmor = true;
        getWorld().addObject(new Message("You now have Armor!!",this), x, y - 20);
        heroHealth = 150;
    }
    
    private void checkCollison(){
        int prevX = x;
        int prevY = y;
        if(isTouching(Wall.class)||isTouching(ItemCrate.class)){
            setLocation(prevX,prevY);  
        }
        if(isTouching(Portal.class)){
            level++;
            WorldAlt world = (WorldAlt) getWorld();
            world.setLevel(level);
        }
        if(isTouching(Potion.class) && !timerRunning){
            Potion potion = (Potion)getOneIntersectingObject(Potion.class);
            int addHP = potion.getHP();
            if(addHP + heroHealth > 100 && !hasArmor){
                heroHealth = 100;
            }else if(addHP + heroHealth > 150 && hasArmor){
                heroHealth = 150;
            }else{
                heroHealth += addHP;
            }
        }
        if(isTouching(ItemCrate.class)){
            ItemCrate crate = (ItemCrate)getOneIntersectingObject(ItemCrate.class);
            if(timerRunning){
                crate.destroyCrate(this);
            }
        }
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
            }
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
                    }
                    else
                    {
                        setLocation(mobX+35,y);
                    }
                    damageRecovery = 30;
                }
            }
        }
        if(!timerRunning && enemy != null)
        {
            
        }
    }

    private void updatePosition(){
        this.x = getX();
        this.y = getY();
    }

    private void flipImage(){
        img.mirrorHorizontally();
        setImage(img);
    }

    private void flipImage(GreenfootImage image)
    {
        image.mirrorHorizontally();
        setImage(image);
    }

    private void move(){
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(x,y-speed);
        }else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(x,y+speed);
        }else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(x-speed,y);
            if(!facingLeft){
                flipImage();
                facingLeft = !facingLeft;
            }
        }else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(x+speed,y);
            if(facingLeft){
                flipImage();
                facingLeft = !facingLeft;
                lastKey = "d";
            }
        }
    }

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
            }
            else if(facingLeft && atkLeft)
            {
                flipImage(atkImg);
                atkLeft = false;
                setLocation(x-25,y);
            }
            else
            {
                setImage(atkImg);
            }
        }
        if(timerRunning)
        {
            timer--;  
        } 
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
    }

    public void takeDamage(int damage)
    {   //user mobDamag as its parameter which is deducted from player health
        heroHealth -= damage;
    }

    public int getHeroX()
    {
        return getX();
    }

    public int getHeroY()
    {
        return getY();
    }

    public int getHeroDamage()
    {
        return heroDamage;
    }
}