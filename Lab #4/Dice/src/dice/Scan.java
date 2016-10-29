
package dice;

import java.util.Scanner;

public class Scan {
    
    public static int get(String msg){
            Scanner in = new Scanner(System.in);
            View.print(msg);
            return in.nextInt();
    }
    
}
