import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        //set.toArray(new Integer[0]): set을 Integer배열로 -> Integer배열을 int배열로
        int[] answer = Arrays.stream(set.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);  //오름차순 정렬
        return answer;
    }
}

/* 다른사람풀이
set.stream().sorted().mapToInt(Integer::intValue).toArray();
위의 방법도 가능하지만, 속도는 느림
*/
