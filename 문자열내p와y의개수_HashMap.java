import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Map map = new HashMap();
        for(int i=0; i<s.length(); i++){
            Character temp = Character.toLowerCase(s.charAt(i));
            if(map.containsKey(temp)){
                int count = (int)map.get(temp);
                map.put(temp,count+1);
            }else{
                map.put(temp,1);
            }
        }
        return map.get('p')!=map.get('y') ?  false : true;
    }
}
