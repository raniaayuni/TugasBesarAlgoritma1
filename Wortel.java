import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wortel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wortel extends Actor
{
    static Counter score = new Counter ("Score");
    public void act() 
    {
        move(2);
        turn(Greenfoot.getRandomNumber(10));
        turnAtEdge(); 
    }    
    public void turnAtEdge(){
       if(getX() <= 15 || getX() >= getWorld().getWidth()-15){
        turn(60);
         }
       if(getY() <= 15 || getY() >= getWorld().getWidth()-15){
         turn(60);
        }
    }
    public void Wortel(){
        Wortel Wortel = new Wortel();
    }

}

