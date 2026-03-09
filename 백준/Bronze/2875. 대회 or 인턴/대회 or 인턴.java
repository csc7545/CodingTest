import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
    int count = 0;
    
    for(int i=0; i<100; i++){
        if(N>=2 && M>=1 && (N+M)-K-3>=0){
            count++;
            N = N - 2;
            M = M - 1;
        }
    }
    
    System.out.println(count);
  }
}