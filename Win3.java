import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win3 extends World
{

    /**
     * Constructor for objects of class Win3.
     * 
     */
    public Win3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void prepare(){
        youwin youwin = new youwin();
        addObject(youwin,397,235);
        youwin = new youwin();
        addObject(youwin,376,244);
        youwin.setLocation(517,273);
        removeObject(youwin);
    }
}
