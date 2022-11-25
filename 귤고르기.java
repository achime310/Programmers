import java.util.*;
import java.util.Map.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int one: tangerine){
            if(map.containsKey(one)){
                map.put(one, map.get(one)+1);
            }else{
                map.put(one,1);
            }
        }

        // Map.Entry 리스트
        List<Entry<Integer, Integer>> entryList = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        // Comparator를 사용하여 정렬
        Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() {
            // 값 비교
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
            // 오름차순 정렬
            //return obj1.getValue().compareTo(obj2.getValue());
            // 내림차순 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int sum = 0;
        for(Entry<Integer, Integer> entry : entryList) {
        //System.out.println(entry.getKey() + " : " + entry.getValue());
            sum += entry.getValue();
            answer++;
            if(k<=sum){
                break;
            }
        }
        return answer;
    }
}
