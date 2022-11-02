class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int temp = 0;

        for(int i=1; i<num; i++){
            temp += i;
        }

        temp = (total-temp)/num;
        for(int i=0; i<num; i++){
            answer[i]=temp+i;
        }

        return answer;
    }
}
