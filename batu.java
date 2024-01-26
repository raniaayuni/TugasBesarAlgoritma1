import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batu extends Actor
{
    /**
     * Act - do whatever the batu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Kelinci.class)){
            getWorld().showText("GameOver", 487,456);
        }
        if(isTouching(Kelinci.class)){
            Greenfoot.stop();
        }
    }
}
