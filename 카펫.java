import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // yellow = axb이면, 가로=a+2, 세로=b+2 -> yellow+brown = (a+2)*(b+2)
        int sqrt = (int) Math.sqrt(yellow);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 1; i <= sqrt; i++){
            if(yellow % i == 0 ){ // 약수 중 큰 수 저장
                map.put(i, yellow / i);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(yellow+brown == (entry.getKey()+2)*(entry.getValue()+2)) {
                if(entry.getKey()>entry.getValue()){
                    answer[0]= entry.getKey()+2;
                    answer[1]= entry.getValue()+2;
                }else{
                    answer[1]= entry.getKey()+2;
                    answer[0]= entry.getValue()+2;
                }
                break;
            }
        }
        
        return answer;
    }
}
