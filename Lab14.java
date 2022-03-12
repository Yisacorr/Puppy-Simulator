/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg14;
/**
 * @author Yisacor
 * Lab 14
 */
public class Lab14 {

    /**
     * Display menu until the users wants to quit.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        boolean quit = false;
        System.out.println("Congratulations on your new puppy!"); 
        do{
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Quit");

            int choice = CheckInput.getIntRange(1, 3);
            
            switch (choice) {
                case 1:
                    puppy.giveFood();
                    break;
                case 2:
                    puppy.throwBall();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    break;
            }
        } while (quit != true);
    }
}
