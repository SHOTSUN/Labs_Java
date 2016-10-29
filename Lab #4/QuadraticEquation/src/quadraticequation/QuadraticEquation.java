
package quadraticequation;

public class QuadraticEquation {

    public static void main(String[] args) {
        
        double a = Scan.get("Hi! Please, enter a...");
        double b = Scan.get("Please, enter b...");
        double c = Scan.get("Please, enter c...");
        
        String answer = Manager.compute(a, b, c);
        
        View.print(answer);
    }
    
}
