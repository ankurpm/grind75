package grind75.array;

public class MaxStockProfit {
    public static void main(String[] args) {
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    private static int maxProfit(int[] prices){
        int buyDay = 0;
        int profit = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[buyDay]<prices[i]){
                if(prices[i]-prices[buyDay]>profit){
                    profit=prices[i]-prices[buyDay];
                }
            }else{
                buyDay = i;
            }
        }
        return profit;
    }
}
