
package vowel;

public class Vowel {

    public static void main(String[] args) {
        
        char let = Scan.get("Enter the letter...");
        
        //boolean flag = Manager.detectIf(let);
        
        boolean flag = Manager.detectSwitch(let);
        
        Manager.work(flag);
    }
    
}
