
package dragon;


public class Counter {
    public static int age(int N) {
        int age;
        
        if (N <= 0){
            return 0;
        }
        if(N < 200){
            age = N * 3;
        }
        else if(N < 300){
            age = 200 * 3 + N * 2; 
        }
        else{
            age = 200 * 3 + 100 * 2 + N;
        }
        
        return age;
    }
}
