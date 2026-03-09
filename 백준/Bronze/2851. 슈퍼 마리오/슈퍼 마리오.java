import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] input = new int[10];
    int sum1 = 0;
    int sum2 = 0;
    
    for(int i=0; i<10; i++){
        input[i] = sc.nextInt();
        
        sum1 = sum1 + input[i];
        if(Math.abs(100-sum1) < Math.abs(100-sum2)){
            sum2 = sum1;
        } else if(Math.abs(100-sum1) == Math.abs(100-sum2) && sum1 > sum2){
            sum2 = sum1;
        }
    }
    
    System.out.println(sum2);
  }
}
