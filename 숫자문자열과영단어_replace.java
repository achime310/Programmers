import java.util.Map;
class Solution {
    public int solution(String s) {
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<alphabets.length; i++){
            //replace함수 활용
            s=s.replaceAll(alphabets[i],i+"");
        }
        return Integer.parseInt(s);
    } 
}

/*
replace와 replaceAll 차이
:replaceAll은 첫번째 인자에 정규식 사용가능
ex>str.replaceAll("[^0-9]", ""); -> 숫자는 전부 공백으로 치환
*/

/*
//map을 활용하는 경우
public int solution(String s) {
    int answer = 0;

    Map<String,Integer> map = Map.of(
        "zero",0,	
        "one",1,	
        "two", 2,	
        "three",3,	
        "four",4,
        "five",5,
        "six",6,
        "seven",7,
        "eight",8,
        "nine",9
    );
    String word = "";
    for(char c: s.toCharArray()){
        if( c < 48 || c > 58){
            //해당 char값이 숫자가 아닐 경우
            word += c;
            System.out.println(word);
            if(map.containsKey(word)){
                answer=answer*10+map.get(word);
                word ="";
            }
        }else{
            if(word!=""){
                answer=answer*10+map.get(word);
                word ="";
            }
            answer=answer*10+c-'0';
        }
    }	
    return answer;
} 
*/
