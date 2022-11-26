import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        /*
        //CASE_1.char배열을 역순으로 string에 대입
        for(int i=arr.length-1;i>=0;i--){
            answer += arr[i]+"";
        }
        */
        
        //CASE_2.StringBuilder활용
        answer = new StringBuilder(new String(arr)).reverse().toString();
        
        return answer;
    }
}
