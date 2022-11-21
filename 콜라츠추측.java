class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        
        while(n!=1){
            answer++;
            if(n%2==0){
                n=n/2;    
            }else{
                n=n*3+1;
            }
            System.out.println(n);
        }
        
        if(answer>=500) answer=-1;
        
        return answer;
    }
}
