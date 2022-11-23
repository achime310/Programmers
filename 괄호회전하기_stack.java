class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            if(check(s)){
                answer++;
            }
            s=String.format("%s%s",s.substring(1),s.charAt(0)); //순서변경
        }

        return answer;
    }
    //string의 괄호쌍 체크
    private boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            switch(c){
                case '(':
                case '[':
                case '{': stack.push(c);    //여는괄호면, stack에 넣기
                            break;
                case ')': if(!check(stack,'(')) return false; //짝이 아니면 다음으로 넘어가기
                    break;
                case ']': if(!check(stack,'[')) return false;
                    break;
                case '}': if(!check(stack,'{')) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
    //char가 stack의 top과 짝이 맞는 지 
    private boolean check(Stack<Character> stack, char c){
        if(!stack.isEmpty() && stack.peek()==c){  //비어있지않고 top이 c와 같으면
            stack.pop();    //꺼내기
            return true;
        }
        return false;
    }
}
