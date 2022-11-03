28
29
30
31
32
33
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        if(array.length==1) return array[0];

        Arrays.sort(array);
        int[] element = new int[array[array.length-1]+1];

        for(int i=0; i<array.length; i++){
            element[array[i]]++;
        }

        int max=0;
        for(int i=0; i<element.length; i++){
            if(element[i] > max){
                max = element[i];
                answer = i;
            }
        }
        int count=0;
        for(int i=0; i<element.length; i++){
            if(element[i] == max){
                count++;
            }
            if(count>1) return -1;
        }

        return answer;
    }
}
