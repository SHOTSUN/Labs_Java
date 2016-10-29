
package vowel;

import java.util.Scanner;

public class Scan {
    
    public static char get(String msg){
            Scanner in = new Scanner(System.in);
            View.print(msg);
            return in.next().toUpperCase().charAt(0);
    }
    
}
