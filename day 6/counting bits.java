class Solution {
    public int[] countBits(int n) {
        int result[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            result[i]=getNoOfBit(i);
        }
        return result;
    }
    int getNoOfBit(int num){
        int count=0;
        for(int i=0;i<=31;i++){
            if((num&(1<<i))>0)
                count ++;
        }
        return count;
    }
}
