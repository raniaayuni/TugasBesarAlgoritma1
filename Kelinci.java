import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kelinci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 
public class Kelinci extends Actor
{
    static Counter score = new Counter("Score");
    public void act() 
    {
        if(isTouching(Wortel.class)){
            }   
        if(Greenfoot.isKeyDown("up")){
            setImage("kelinci-up.png");
            setLocation(getX(),getY()-8);
        }
        if(Greenfoot.isKeyDown("down")){
            setImage("kelinci-up.png");
            setLocation(getX(),getY()+8);
        }
        if(Greenfoot.isKeyDown("left")){
            setImage("kelinci-up.png");
            setLocation(getX()-8,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setImage("Kelinci.png");
            setLocation(getX()+8,getY());
        }
        if(isTouching(batu.class)){
            Greenfoot.setWorld(new GameOver2());
        }
        if(isTouching(batu2.class)){
            Greenfoot.setWorld(new GameOver3());
        }
        
        
        Wortel a=(Wortel)getOneIntersectingObject(Wortel.class);
        if (a!=null){
            getWorld().removeObject(a);
            Greenfoot.playSound("Slurp.wav");
            Stage1.score.add(1); 
        }
        wortel2 b=(wortel2)getOneIntersectingObject(wortel2.class);
        if (b!=null){
            getWorld().removeObject(b);
            Greenfoot.playSound("Slurp.wav");
            Stage2.score.add(1); 
        }
        wortel3 c=(wortel3)getOneIntersectingObject(wortel3.class);
        if (c!=null){
            getWorld().removeObject(c);
            Greenfoot.playSound("Slurp.wav");
            Stage3.score.add(1); 
        }
        // Greenfoot.playSound("Slurp.wav");
        
        
        

        // batu b=(batu)getOneIntersectingObject(batu.class);
        // if (a!=null){
            // getWorld().removeObject(a);
            // Stage2.live.add(-1);
        // }
        // batu2 c=(batu2)getOneIntersectingObject(batu2.class);
        // if (a!=null){
            // getWorld().removeObject(a);
            // Stage3.live.add(-1);
        
        // MakanWortel();
        // cekScore();
        // getWorld().showText("Score: "+JumlahWortelDimakan,100,50);
    } 
    
    // public void MakanWortel(){
        // Actor getWortel =getOneIntersectingObject(Wortel.class);
        // if(getWortel != null){
            // getWorld().removeObject(getWortel);
            // Greenfoot.playSound("Slurp.wav");
            // Stage1.score.add(1);
        // }
       // }
           
       
    // public void cekScore(){
        // if(JumlahWortelDimakan >9){
            // // Finish alret_finish = new Finish();
            // // getWorld().addObject(alret_finish,400,300);
            // Greenfoot.setWorld(new Stage2());
    // }
    // if(JumlahWortelDimakan >14){
            // // Finish alret_finish = new Finish();
            // // getWorld().addObject(alret_finish,400,300);
            // Greenfoot.setWorld(new Stage3());
    // }
    }