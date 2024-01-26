import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends World
{
    static Counter score = new Counter("Score");
    public Stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(85)<1){
            addObject(new Wortel(),Greenfoot.getRandomNumber(800)+0,300);
        }
        if(Stage3.score.getValue()>=7) {
            Greenfoot.setWorld(new Win3());
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
        batu2 batu2 = new batu2();
        addObject(batu2,655,342);
        batu2 batu22 = new batu2();
        addObject(batu22,393,245);
        batu2 batu23 = new batu2();
        addObject(batu23,561,130);
        batu2 batu24 = new batu2();
        addObject(batu24,599,526);
        batu2 batu25 = new batu2();
        addObject(batu25,247,63);
        batu2 batu26 = new batu2();
        addObject(batu26,298,423);
        batu2 batu27 = new batu2();
        addObject(batu27,390,545);
        batu2 batu28 = new batu2();
        addObject(batu28,745,70);
        batu2 batu29 = new batu2();
        addObject(batu29,752,526);
        batu2 batu210 = new batu2();
        addObject(batu210,475,26);
        batu2 batu211 = new batu2();
        addObject(batu211,118,545);

        addObject(score, 50,30);
        score.setValue(0);

        removeObject(wortel);
        removeObject(wortel2);
        removeObject(wortel4);
        wortel5.setLocation(236,531);
        removeObject(wortel5);
        wortel3.setLocation(330,323);
        removeObject(wortel3);
        wortel6.setLocation(420,429);
        removeObject(wortel6);
        wortel7.setLocation(497,527);
        removeObject(wortel7);
        removeObject(wortel10);
        wortel8.setLocation(412,130);
        removeObject(wortel8);
        removeObject(wortel9);
        wortel12.setLocation(723,243);
        removeObject(wortel12);
        wortel11.setLocation(675,420);
        wortel11.setLocation(675,420);
        removeObject(wortel11);
        wortel3 wortel31 = new wortel3();
        addObject(wortel3,249,271);
        wortel3 wortel32 = new wortel3();
        addObject(wortel32,376,321);
        wortel3 wortel33 = new wortel3();
        addObject(wortel33,562,228);
        wortel3 wortel34 = new wortel3();
        addObject(wortel34,628,446);
        wortel3 wortel35 = new wortel3();
        addObject(wortel35,262,312);
        wortel3 wortel36 = new wortel3();
        addObject(wortel36,302,185);
        wortel3 wortel37 = new wortel3();
        addObject(wortel37,394,432);
        wortel3 wortel38 = new wortel3();
        addObject(wortel38,189,413);
        wortel3 wortel39 = new wortel3();
        addObject(wortel39,536,359);
        wortel3 wortel310 = new wortel3();
        addObject(wortel310,726,219);
        wortel3 wortel311 = new wortel3();
        addObject(wortel311,662,110);
        wortel3 wortel312 = new wortel3();
        addObject(wortel312,483,137);
        wortel3 wortel313 = new wortel3();
        addObject(wortel313,371,92);
        wortel3 wortel314 = new wortel3();
        addObject(wortel314,490,537);
        wortel3 wortel315 = new wortel3();
        addObject(wortel315,277,514);
        wortel3 wortel316 = new wortel3();
        addObject(wortel316,487,287);
        wortel3 wortel317 = new wortel3();
        addObject(wortel317,208,179);
        wortel3 wortel318 = new wortel3();
        addObject(wortel318,757,408);
        wortel3 wortel319 = new wortel3();
        addObject(wortel319,517,430);
        wortel3 wortel320 = new wortel3();
        addObject(wortel320,174,95);
        
        // Greenfoot.playSound("Bg.wav");
    }
}
