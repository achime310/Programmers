class Solution {
    public long solution(int price, int money, int count) {
        long totalAmount = 0;
        
        for(int i=1; i<=count; i++){
            totalAmount += price*i;
        }
        
        if(money-totalAmount<0){
            return totalAmount-money;
        }
        return 0;
        
    }
}
