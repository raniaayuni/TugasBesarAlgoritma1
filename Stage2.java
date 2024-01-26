import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{
    static Counter score = new Counter("Score");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(85)<1){
            addObject(new Wortel(),Greenfoot.getRandomNumber(800)+0,300);
        }
        if(Stage2.score.getValue()>=6) {
            Greenfoot.setWorld(new Win2());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Kelinci kelinci = new Kelinci();
        addObject(kelinci,90,319);
        Wortel wortel = new Wortel();
        addObject(wortel,123,120);
        Wortel wortel2 = new Wortel();
        addObject(wortel2,235,242);
        Wortel wortel3 = new Wortel();
        addObject(wortel3,334,325);
        Wortel wortel4 = new Wortel();
        addObject(wortel4,178,422);
        Wortel wortel5 = new Wortel();
        addObject(wortel5,252,531);
        Wortel wortel6 = new Wortel();
        addObject(wortel6,428,418);
        Wortel wortel7 = new Wortel();
        addObject(wortel7,491,538);
        wortel7.setLocation(494,521);
        Wortel wortel8 = new Wortel();
        addObject(wortel8,416,122);
        Wortel wortel9 = new Wortel();
        addObject(wortel9,658,123);
        Wortel wortel10 = new Wortel();
        addObject(wortel10,549,242);
        Wortel wortel11 = new Wortel();
        addObject(wortel11,672,412);
        Wortel wortel12 = new Wortel();
        addObject(wortel12,722,238);
        batu batu = new batu();
        addObject(batu,487,341);
        batu batu2 = new batu();
        addObject(batu2,545,131);
        batu batu3 = new batu();
        addObject(batu3,676,514);
        batu batu4 = new batu();
        addObject(batu4,323,244);
        batu batu5 = new batu();
        addObject(batu5,740,351);
        batu batu6 = new batu();
        addObject(batu6,337,516);
        batu batu7 = new batu();
        addObject(batu7,263,89);

        addObject(score, 50,30);
        score.setValue(0);

        removeObject(wortel3);
        removeObject(wortel4);
        removeObject(wortel2);
        removeObject(wortel5);
        removeObject(wortel8);
        wortel2 wortel21 = new wortel2();
        addObject(wortel2,417,140);
        wortel2 wortel22 = new wortel2();
        addObject(wortel22,297,372);
        wortel10.setLocation(523,254);
        wortel2 wortel23 = new wortel2();
        addObject(wortel23,228,241);
        removeObject(wortel10);
        removeObject(wortel11);
        wortel7.setLocation(496,529);
        removeObject(wortel7);
        removeObject(wortel6);
        removeObject(wortel22);
        removeObject(wortel23);
        removeObject(wortel);
        wortel2.setLocation(391,161);
        removeObject(wortel2);
        wortel9.setLocation(642,125);
        removeObject(wortel9);
        removeObject(wortel12);
        // wortel2 wortel21 = new wortel2();
        // addObject(wortel21,713,75);
        // wortel2 wortel22 = new wortel2();
        // addObject(wortel22,612,402);
        // wortel2 wortel23 = new wortel2();
        addObject(wortel23,710,243);
        wortel2 wortel24 = new wortel2();
        addObject(wortel24,526,247);
        wortel2 wortel25 = new wortel2();
        addObject(wortel25,392,95);
        wortel2 wortel26 = new wortel2();
        addObject(wortel26,479,514);
        wortel2 wortel27 = new wortel2();
        addObject(wortel27,395,358);
        wortel2 wortel28 = new wortel2();
        addObject(wortel28,563,517);
        wortel2 wortel29 = new wortel2();
        addObject(wortel29,232,309);
        wortel2 wortel210 = new wortel2();
        addObject(wortel210,284,412);
        wortel2 wortel211 = new wortel2();
        addObject(wortel211,287,150);
        wortel2 wortel212 = new wortel2();
        addObject(wortel212,635,237);
        wortel2 wortel213 = new wortel2();
        addObject(wortel213,246,509);
        wortel2 wortel214 = new wortel2();
        addObject(wortel214,208,167);
        wortel2 wortel215 = new wortel2();
        addObject(wortel215,443,212);
        wortel2 wortel216 = new wortel2();
        addObject(wortel216,723,431);
        wortel2 wortel217 = new wortel2();
        addObject(wortel217,454,426);
        removeObject(batu6);
        removeObject(batu4);
        wortel2 wortel218 = new wortel2();
        addObject(wortel218,385,499);
        wortel2 wortel219 = new wortel2();
        addObject(wortel219,347,251);
        
        // Greenfoot.playSound("Bg.wav");
    }
}
