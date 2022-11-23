class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a!=b){
            //2로 나누면서, 홀수면 나머지를 더하도록
            a=(a/2)+(a%2);
            b=(b/2)+(b%2);
            answer++;   //라운드 카운트
            if(a==b) break;   //라운드 몇번째인지 같으면 stop
        }

        return answer;
    }
}
