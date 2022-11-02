class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int num = 0;
        int denum = 0;

        num = num1*num2;
        denum = (denum1*num2 + denum2*num1);

        int min = (num<denum) ? num: denum;
        int gcd = 0;
        for(int i=1; i<=min; i++){
            if(num%i==0 && denum%i==0){
                gcd=i;
            }
        }

        answer[0]=denum/gcd;
        answer[1]=num/gcd;

        return answer;
    }
}
