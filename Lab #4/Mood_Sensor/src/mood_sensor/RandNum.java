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
public class RandNum {
    
    public static int random(int max)
        {
                return (int) (Math.random() * ++max);
        }
}
