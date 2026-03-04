import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x1 = (int)(-a - Math.sqrt(a*a - b));
        int x2 = (int)(-a + Math.sqrt(a*a - b));
        
        if(x1 == x2){
            System.out.println(x1);
        } else {
            System.out.println(x1 + " " + x2);
        }
    }
}