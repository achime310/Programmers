import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length<=1) return new int[]{-1};

        int[] answer = new int[arr.length-1];
        int[] temp = arr.clone(); //깊은복사
        Arrays.sort(temp);  //최소값을 얻기 위해 오름차순 정렬
        for(int i=0, j=0;i<arr.length;i++){  
            if(arr[i]!=temp[0]){  //최소값과 같지않으면 대입
                answer[j]=arr[i];
                j++;
            }
        }

        return answer;
    }
}
