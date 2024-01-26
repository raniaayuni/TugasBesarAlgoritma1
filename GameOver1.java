import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver1 extends World
{

    /**
     * Constructor for objects of class GameOver1.
     * 
     */
    public GameOver1()
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
        addObject(gameOver,398,293);
        gameOver.setLocation(735,463);
        gameOver.setLocation(594,414);
        gameOver.setLocation(312,310);
        gameOver.setLocation(312,310);
        gameOver.setLocation(596,311);
        gameOver.setLocation(419,295);
    }
}
