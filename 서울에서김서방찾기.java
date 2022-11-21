class Solution {
    public String solution(String[] seoul) {
        int i = 0;

        for(; i<seoul.length; i++){
            System.out.println(i);
            if(seoul[i].equals("Kim")) break;
        }

        return "김서방은 "+i+"에 있다";
    }
}
