import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map map = new HashMap();
        map.put(0,words[0]);  //첫번째 문자 넣고
        for(int i=1; i<words.length;i++){
            //map에 동일한 문자가 없거나 끝말잇기가 성립하면
            if(!map.containsValue(words[i]) && words[i-1].charAt(words[i-1].length()-1)==words[i].charAt(0)){
                //map에 문자 넣고
                map.put(i,words[i]);
            } else{ //그렇지 않으면
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
        }

        return answer;
    }
}
