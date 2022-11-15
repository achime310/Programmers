class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        while(s.length()>1){
            answer[0]++;
            int temp = 0;
           for(int i=0; i<s.length();i++){
               if(s.charAt(i)=='0'){
                   answer[1]++;   //0의 갯수
               }else {
                   temp++;  //1의 갯수 = 10진수
               }
           }
            s=Integer.toBinaryString(temp);
        }
        return answer;
    }
}
