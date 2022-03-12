/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg14;

/**
 * @author Yisacor
 * AsleapState class 
 */
public class AsleepState extends PuppyState {
    /**
    * play method overrides play method in the PuppyState.
    * @param p Puppy
    */
    @Override
    public void play(Puppy p){
        System.out.println("Puppy is asleep. It doesn't want to play now.");
    }
    
    /**
    * feed method overrides feed method in the PuppyState.
    * @param p Puppy
    */
    @Override
    public void feed(Puppy p){
        p.setState(new EatingState());
        System.out.println("Puppy wakes up and comes running to eat");
        p.incFeeds();
    }
}
