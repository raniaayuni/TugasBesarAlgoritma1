import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batu2 extends Actor
{
    /**
     * Act - do whatever the batu2 wants to do. This method is called whenever
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
        move(2);
        turn(Greenfoot.getRandomNumber(10));
      
        
    }
    // public void turnAtEdge(){
       // if(getX() <= 15 || getX() >= getWorld().getWidth()-15){
        // turn(60);
         // }
       // if(getY() <= 15 || getY() >= getWorld().getWidth()-15){
         // turn(60);
        // }
    // }
}
