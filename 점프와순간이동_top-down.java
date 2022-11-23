public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n!=0){    //top-down방식을 이용
            if(n%2==0){ //짝수면
                n /= 2; //그 전에서 순간이동하면 되고
            }else{      //홀수면
                n -= 1; //그 전에서 점프1칸 하면 된다.
                ans++;
            }
        }

        return ans;
    }
}
