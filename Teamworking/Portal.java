
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    }

    public Portal(World2 world){
        world2 = world;
    }

    public Portal(World3 world){
        world3 = world;
    }

    public Portal(World4 world){
        world4 = world;
    }

    public Portal(World5 world){
        world5 = world;
    }   

    public void transitionWorld(Hero hero){
        if(world1 != null){
            Greenfoot.setWorld(world1);
            world1.setHero(hero);
        }
        if(world2 != null){
            Greenfoot.setWorld(world2);
            world2.setHero(hero);
        }
        if(world3 != null){
            Greenfoot.setWorld(world3);
            world3.setHero(hero);
        }
        if(world4 != null){
            Greenfoot.setWorld(world4);
        }
        if(world5 != null){
            Greenfoot.setWorld(world5);
        }
    }          
}