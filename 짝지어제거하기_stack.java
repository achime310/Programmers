import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            //비어있지않고+top과 같으면 -> 꺼내기
            if(!stack.isEmpty() && stack.peek() ==c) stack.pop();
        //그렇지 않으면 -> 넣기
            else stack.push(c);
        }

        return stack.isEmpty() ? 1:0;
    }
}
/*
//(실패)효율성테스트
public int solution(String s)
    {
        int answer = 0;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) {
                s=s.replace(s.substring(i,i+2),"");
                if(i!=0) {
                    i=i-2;
                }else {
                    i=-1;
                }
            }
        }   
        if(s.length()==0) answer = 1;

        return answer;
    }
*/
