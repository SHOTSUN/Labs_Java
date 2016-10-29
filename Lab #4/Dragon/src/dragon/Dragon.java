
package dragon;

public class Dragon {

    public static void main(String[] args) {
        
        int age =   Scan.get("Enter the age of dragon...");
        int head_num = Counter.age(age);
        View.print(head_num + " - Number of heads");
    }
    
}
