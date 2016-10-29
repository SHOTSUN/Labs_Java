
package nextday;

public class Manager {
    
    public static String compute(int d, int m, int y) {
        
        int d1;
        
        if ((m !=2) && (m == 4) || (m == 6) || (m == 9) || (m == 11)){
            d1 = 30;
        }
        else if ((m == 2) && (y % 4 != 0)){
            d1 = 28;
        }
            
        else if ((m == 2) && (y % 4 == 0)){
            d1 = 29;
        }
        else{
            d1 = 31;
        }
        
        d++;
        
        if (d > d1){
            d = 1;
            m++;
        }
        if (m > 12){
            m = 1;
            y++;
        }
                    
        return d + " " + m + " " + y;
        
    }
    
}
