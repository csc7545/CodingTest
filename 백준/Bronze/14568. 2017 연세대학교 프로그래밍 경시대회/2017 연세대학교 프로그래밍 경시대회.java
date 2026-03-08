// 1. 남는 사탕 No
// 2. 남규는 영훈이보다 2개 이상 많은 사탕을 가져야 한다.
// 3. 셋 중 사탕을 0개 받는 사람은 없어야 한다.
// 4. 택희가 받는 사탕의 수는 홀수개가 되어서는 안 된다.
// 입력: 첫째 줄에 사탕의 총 개수 n (1<=n<=100)
// 출력: 규칙에 맞게 분배하는 경우의 수

// 예를 들어서 6이 나오면
// 남규: 3
// 영훈: 1
// 택희: 2
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int taek = 0, young = 0, nam = 0;
        int count = 0;
        
        for(taek=1; taek<=x; taek++){
            if(taek%2 != 0){
                continue;
            }
            for(young=1; young<=x; young++){
                nam = x - taek - young;
                
                if(taek<0 || young<0 || nam<0){
                    continue;
                }
                if(nam < young+2){
                    continue;
                }
                
                count = count + 1;
            }
        }
        
        System.out.println(count);
    }
}