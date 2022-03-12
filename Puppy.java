/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg14;

/**
 *
 * @author Yisacor
 * Puppy class
 */
public class Puppy {
    private PuppyState state;
    private int numFeeds;
    private int numPlays;
    
    /**
    * Puppy constructor initialize numFeed, numPlay and create state object.
    */
    public Puppy(){
        numFeeds = 0;
        numPlays = 0;
        state = new AsleepState(); 
    }
    /**
    * setState method initialize state with s.
    * @param s PuppyState
    */
    public void setState(PuppyState s){  
        state = s;
    }
    
    /**
    * throwBall method calls play method.
    */
    public void throwBall(){
        state.play(this);
    }
    
    /**
    * giveFood method calls feed method.
    */
    public void giveFood(){
        state.feed(this);
    }
    
    /**
    * incFeeds method increments feed number.
    * @return incremented feed number
    */
    public int incFeeds(){
        return numFeeds++;
    }
    
    /**
    * incPlays method increments play number.
    * @return incremented play number
    */
    public int incPlays(){ 
        return numPlays++;
    }
    
    /**
    * reset method resets numFeeds, numPlay and state.
    */
    public void reset(){
        numFeeds = 0;
        numPlays = 0;
        state = new AsleepState();
    }
}
