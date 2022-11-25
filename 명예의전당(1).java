import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(score[0],score[1]));

        answer[0] = score[0];
        answer[1] = Math.min(score[0],score[1]);

        for(int i=2;i<score.length;i++){
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if(i<k){
                answer[i]=list.get(i);
            }else{
                answer[i]=list.get(k-1);
            }
        }
        
        return answer;
    }
}
