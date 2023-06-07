lass Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minseensofar = prices[0];
        for(int day=1;day<prices.length;day++){
            int pricetoday=prices[day];
            if(pricetoday<minseensofar){
                minseensofar=pricetoday;
                continue;
            }
            maxProfit = Math.max(maxProfit,pricetoday-minseensofar);
        }
       return maxProfit; 
    }
}
//TC = O(n)---> single pass & SC = O(1)--> only 2 variables are used
