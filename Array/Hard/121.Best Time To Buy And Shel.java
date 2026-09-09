class Solution {
    public int maxProfit(int[] prices) {

        int maxProfite=0;
        int BestBuy=prices[0];
        for(int i=0;i<prices.length;i++){
            //BUY KE LIYE MENE MIN KA FUNCTION USE KIYA,  JO CURRENT I KI VALUE H USKO 'BESTBUY' SE COMPAIRE KIYA JOBHI HOGA VO SAVE HO JAE GA 
            BestyBuy=Math.min(prices[i],BestBuy);
            if(prices[i]>BestBuy){
                //PRIFITE KE LIYE BASS MAX KI CONDITION LAGA DIYE , JO MAXprofite SAVE KIYA THA AUR CURRENT PRICE SUBTRACE BESTBUY SE DIFF MIL JATA JO SABSE BADHA HOTA VOHI SAVE HO JATA MAXPROFITE ME 
                maxProfite=Math.max(maxProfite,price[i]-BestBuy);
            }

        }
        return maxProfite;

    }

}  