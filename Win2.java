import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win2 extends World
{

    /**
     * Constructor for objects of class Win2.
     * 
     */
    public Win2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        youwin youwin = new youwin();
        addObject(youwin,397,235);
        level3 level3 = new level3();
        addObject(level3,406,448);
    }
}
