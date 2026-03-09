import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    
    for(int A=1; A<=N; A++){
        for(int B=1; B<=N; B++){
            if(((A*A)-(B*B)) == N){
                count++;
            }
        }
    }
    
    System.out.println(count);
  }
}
