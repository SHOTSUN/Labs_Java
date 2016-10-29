
package quadraticequation;

import java.util.Scanner;

public class Scan {
    
    public static double get(String msg){
            Scanner in = new Scanner(System.in);
            View.print(msg);
            return in.nextDouble();
    }
    
}
