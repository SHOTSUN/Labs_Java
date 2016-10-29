/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mood_sensor;

/**
 *
 * @author Владислав
 */


public class Mood_Sensor {

    public static void main(String[] args) {
        
        int rand = RandNum.random(80);
        
        if ((0 <= rand) && (rand < 20)){
            System.out.println("(︶ω︶)");
        }
       
        if ((20 <= rand) && (rand < 40)){
            View.print(":D");
        }
        if ((40 <= rand) && (rand < 60)){
            View.print("(︶︿︶)");
        }
        
        if ((60 <= rand) && (rand < 80)){
            View.print(":)");
        }
    }
}
