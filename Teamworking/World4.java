import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{
    private Hero hero;
    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Hero hero)
    {
        super(1095,540,1);
        bg("world4.png");
        this.hero = hero;
        addObjects();
    }

    private void bg(String bgImage){
        GreenfootImage bg = new GreenfootImage(bgImage);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    protected void addObjects(){
        addObject(hero,100,100);
        
        Wall vertWallOne = new Wall(2, 60);
        Wall vertWallTwo = new Wall(2, 60);
        Wall vertWallThree = new Wall(2, 190);
        Wall vertWallFour = new Wall(2, 190);
        Wall vertWallFive = new Wall(2, 190);
        Wall vertWallSix = new Wall(2, 190);
        Wall vertWallSeven = new Wall(2, 360);
        Wall vertWallEight = new Wall(2, 390);
        Wall vertWallNine = new Wall(2, 50);
        Wall vertWallTen = new Wall(2, 50);
        Wall vertWallEleven = new Wall(2, 50);
        Wall vertWallTwelve = new Wall(2, 250);
        Wall vertWallThirteen = new Wall(2, 250);
        
        Wall horWallOne = new Wall(700,2);//done
        Wall horWallTwo = new Wall(150,2);//done
        Wall horWallThree = new Wall(65,2);//done
        Wall horWallFour = new Wall(200,2);//done
        Wall horWallFive = new Wall(155,2);//done
        Wall horWallSix = new Wall(150,2);//done
        Wall horWallSeven = new Wall(100,2);//done
        Wall horWallEight = new Wall(100,2);//done
        Wall horWallNine = new Wall(120,2);//done
        Wall horWallTen = new Wall(120,2);//done
        Wall horWallEleven = new Wall(275,2);//done
        Wall horWallTwelve = new Wall(295,2);//done
        Wall horWallThirteen = new Wall(420,2);//done
        
        addObject(horWallOne,301,48);//done
        addObject(horWallTwo,17,124);//done
        addObject(horWallThree,223,124);//done
        addObject(horWallFour,138,152);//done
        addObject(horWallFive,403,227);//done
        addObject(horWallSix,303,304);//done
        addObject(horWallSeven,328,343);//done
        addObject(horWallEight,496,343);//done
        addObject(horWallNine,505,304);//done
        addObject(horWallTen,614,147);//done
        addObject(horWallEleven,412,491);//done
        addObject(horWallTwelve,825,487);//done
        addObject(horWallThirteen,761,84);//done
        
        addObject(vertWallOne, 92, 153);
        addObject(vertWallTwo, 192, 153);
        addObject(vertWallThree, 257, 219);
        addObject(vertWallFour, 327, 136);
        addObject(vertWallFive, 481, 136);
        addObject(vertWallSix, 552, 241);
        addObject(vertWallSeven, 677, 327);
        addObject(vertWallEight, 970, 291);
        addObject(vertWallNine, 551, 68);
        addObject(vertWallTen, 382, 328);
        addObject(vertWallEleven, 441, 328);
        addObject(vertWallTwelve, 280, 458);
        addObject(vertWallThirteen, 543, 458);
    }

}

