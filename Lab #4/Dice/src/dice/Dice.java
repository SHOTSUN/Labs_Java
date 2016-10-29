/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author Владислав
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View.print("Roll the dice !!!");
        int d1 = RandNum.random(5) + 1;
        int d2 = RandNum.random(5) + 1;
        int sum = d1+d2;
        View.print("\nThe sum of points:" + sum + "!");
        View.print("\nPress Enter to exit...");
    }
    
}
