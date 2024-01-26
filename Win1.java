import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win1 extends World
{

    /**
     * Constructor for objects of class Win1.
     * 
     */
    public Win1()
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
        addObject(youwin,372,287);
        level2 level2 = new level2();
        addObject(level2,418,441);
        youwin.setLocation(400,200);
        level2.setLocation(400,450);
    
    }
}
