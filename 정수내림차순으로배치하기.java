import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long[] array = new long[(n+"").length()];

        for(int i=0; i<array.length;i++){
            array[i]=n%10;
            n = n/10;
        }
        Arrays.sort(array);

        for(int i=array.length-1; i>=0;i--){
            answer = answer*10+ array[i];
        }
        
        return answer;
    }
}
