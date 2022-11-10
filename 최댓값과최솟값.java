import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List list = new ArrayList();
        
        while(true){
            int idx = s.indexOf(" ");
            if(idx==-1) {
                list.add(Integer.parseInt(s.substring(idx+1)));
                break;
            }
            list.add(Integer.parseInt(s.substring(0,idx)));
            s=s.substring(idx+1);
        }

        Collections.sort(list);

        int min = (int)list.get(0);
        int max = (int)list.get(list.size() - 1);
        answer=""+min+" "+max;

        return answer;
    }
}
