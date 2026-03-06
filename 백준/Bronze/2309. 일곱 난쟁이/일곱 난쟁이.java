import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];
        int[] result = new int[7];
        int idx = 0;
        int x = 0;
        int a = -1;
        int b = -1;
        
        for(int i=0; i<9; i++) {
            list[i] = sc.nextInt(); // 일단 리스트에 다 넣고..
            x = x + list[i]; // 다 더하고...
        }

        int diff = x - 100; // 다 더한거에서 뺴고..

        for(int i=0; i<9; i++){
          for(int j=i+1; j<9; j++){
            if(list[i] + list[j] == diff){
              a = i;
              b = j;
              break;
            }
          }
          if(a != -1){
            break;
          }
        }

        for(int i=0; i<9; i++){
          if(i != a && i != b){
            result[idx++] = list[i];
          }
        }
        
        Arrays.sort(result); // 오름차순 정렬..

        for(int i=0; i<7; i++){
          System.out.println(result[i]);
        }
    }
}