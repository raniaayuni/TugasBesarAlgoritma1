import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver3 extends World
{

    /**
     * Constructor for objects of class GameOver3.
     * 
     */
    public GameOver3()
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
        GameOver gameOver = new GameOver();
        addObject(gameOver,398,300);
    }
}
