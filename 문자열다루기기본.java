class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        if(s.length()==4 ||s.length()==6){  //문자열 s의 길이가 4 혹은 6
            answer = true;
            for(char c: s.toCharArray()){
                if(c>='A'){ //문자가 포함되어 있다면
                    answer=false;
                    break;
                }
            }
        }
        return answer;
    }
}
