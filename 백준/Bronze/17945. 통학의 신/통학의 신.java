import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int x1 = 0;
    int x2 = 0;
    
    x1 = (int)(-A - Math.sqrt(A*A - B));
    x2 = (int)(-A + Math.sqrt(A*A - B));
    
    if(x1 == x2){
        System.out.println(x1);
    } else{
        System.out.println(x1 + " " + x2);
    }
  }
}
