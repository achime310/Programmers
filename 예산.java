import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d); //배열 오름차순 정렬
        for(int i=0; i<d.length; i++){
            System.out.println("i="+i+" sum="+sum);
            if(sum+d[i] > budget) {
                break;
            }
            sum += d[i];
            answer = i+1;
        }
        return answer;
    }
}
