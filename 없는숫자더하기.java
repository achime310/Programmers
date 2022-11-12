import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Map map = new HashMap();

        for(int i=0; i<numbers.length; i++){
            map.put(i, numbers[i]);
        }

        for(int i=0; i<10; i++){
            if(!map.containsValue(i)) answer += i;
        }

        return answer;
    }
}
