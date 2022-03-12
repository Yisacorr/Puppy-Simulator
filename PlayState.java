/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg14;

/**
 * @author Yisacor
 * playState class
 */
public class PlayState extends PuppyState {
    /**
    * play method overrides play method in the PuppyState.
    * @param p Puppy
    */
    @Override
    public void play(Puppy p) {
        System.out.println("You threw the ball again and the puppy excitedly chases it.");
        p.incPlays();

        if (p.incPlays() > 2) {
            System.out.println("The puppy played so much it fell asleep!");
            p.reset();
        }
    }
    
    /**
    * feed method overrides feed method in the PuppyState.
    * @param p Puppy
    */
    @Override
    public void feed(Puppy p) {
        System.out.println("The puppy continues to eat as you add another scoop of kibble to its bowl.");
        p.incFeeds();

        if (p.incFeeds() > 2) {
            System.out.println("The puppy ate so much it fell asleep!");
            p.reset();
        }
    }
}
