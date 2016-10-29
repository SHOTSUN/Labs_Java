
package quadraticequation;

public class Manager {
    
    public static String compute(double a, double b, double c) {
        
        double d = Math.pow(b, 2) - 4 * a * c;
        View.print(d + " ");
        
        if (d > 0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "x1 = " + x1 + "; x2 = " + x2;
        }

        else if (d == 0){
            double  x = (-b)/(2*a);
            return "x = " + x;
        }
        else{
            return "The equation has no roots";
        }
    }
}
