import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // 양 그램
    int b = sc.nextInt(); // 염소 그램
    int n = sc.nextInt(); // 전체 수
    int w = sc.nextInt(); // 전체 그램
    
    if (a == b) {
        if (w != a*n) {
            System.out.println(-1);
        } else if(n == 2){
            System.out.println("1 1");
        }
        else {
            System.out.println(-1);
        }
        return;
    }
    
    if((-b*n+w) % (a-b) != 0){
        System.out.println(-1);
        return;
    }

    int x = (-b*n+w) / (a-b);
    int y = n - x;
    
    if(x <= 0 || y <= 0) {
        System.out.println(-1);
    } else{
        System.out.println(x + " " + y);
    }
  }
}
