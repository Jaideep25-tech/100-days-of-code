class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int minSoFar=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int currentProfit=prices[i]-minSoFar;
            if(currentProfit>ans){
                ans=currentProfit;
            }
            minSoFar=Math.min(minSoFar,prices[i]);
        }
        return ans;
    }
}
