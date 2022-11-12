import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        List<Integer> list = new ArrayList();
        for(int i=left, k=0; i<=right; i++,k++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0) count++;
            }
            if(count%2==1) {
                list.add(-1);
            }else{
                list.add(1);
            }
        }

        for(int i=0,j=left; i<list.size(); i++,j++){
            answer+=list.get(i)*j;
        }

        return answer;
    }
}
