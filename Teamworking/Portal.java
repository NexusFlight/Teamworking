
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Team A
 */
public class Portal extends Actor
{
    World1 world1;
    World2 world2;
    World3 world3;
    World4 world4;
    World5 world5;
    public Portal(World1 world){
        world1 = world;
    }//end Portal 

    public Portal(World2 world){
        world2 = world;
    }//end Portal 

    public Portal(World3 world){
        world3 = world;
    }//end Portal 

    public Portal(World4 world){
        world4 = world;
    }//end Portal 

    public Portal(World5 world){
        world5 = world;
    }//end Portal 

    public void transitionWorld(Hero hero){
        if(world1 != null){
            Greenfoot.setWorld(world1);
            world1.setHero(hero);
        }//end if
        if(world2 != null){
            Greenfoot.setWorld(world2);
            world2.setHero(hero);
        }//end if
        if(world3 != null){
            Greenfoot.setWorld(world3);
            world3.setHero(hero);
        }//end if
        if(world4 != null){
            Greenfoot.setWorld(world4);
        }//end if
        if(world5 != null){
            Greenfoot.setWorld(world5);
        }//end if
    }//end transitionWorld
}//end class
