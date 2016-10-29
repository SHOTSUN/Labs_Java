
package nextday;

public class NextDay {

    public static void main(String[] args) {
        
        int d = Scan.get("Enter the day...");
        int m = Scan.get("Enter the mounth...");
        int y = Scan.get("Enter the year...");
        
        String newDate = Manager.compute(d, m, y);
        
        View.print(newDate);
        
    }
    
}
