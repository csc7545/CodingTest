import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    HashMap<Long,Integer> map = new HashMap<>(); // {누적합, 등장횟수}
    long sum = 0;
    long count = 0;
    
    map.put(0L,1); // 0 - 0 = 0
    
    for(int i=0; i<N; i++){
        A[i] = sc.nextInt();
    }
    
    for(int i=0; i<N; i++){
        sum += A[i];
        count += map.getOrDefault(sum - K, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    
    System.out.println(count);
  }
}