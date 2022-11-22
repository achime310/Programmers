class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        //10진수를 2진수로 변환
        for(int j=0;j<n;j++){
            String result = "";
            String element1 = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[j])));
            String element2 = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[j])));

            for(int i=0;i<n;i++){
                if(element1.charAt(i)=='1' || element2.charAt(i)=='1') result+="#";
                else result+=" ";
            }
            answer[j]=result;
        }  
        
        return answer;
    }
}
//다른사람풀이: Integer.toBinaryString(arr1[i] | arr2[i]);
