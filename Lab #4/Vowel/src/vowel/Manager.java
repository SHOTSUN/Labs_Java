
package vowel;


public class Manager {
    
    public static boolean detectIf(char letter) {
        
    if((letter == 'A') || (letter == 'E') || (letter == 'I') ||
            (letter == 'O') || (letter == 'U') || (letter == 'Y')){
        return true;
    }
    return false;
    
}
    
    public static boolean detectSwitch(char letter) {
        
        switch(letter){
            
            case 'A': return true;
            case 'E': return true;
            case 'I': return true;
            case 'O': return true;
            case 'U': return true;
            case 'Y': return true;
            default: return false; 
        }
        
}
    
    public static void work(boolean flag) {
        
        if(flag){
            View.print("This symbol is vowel");
        }
        else{
            View.print("This symbol is not consonant letter");
        }
    }
}
