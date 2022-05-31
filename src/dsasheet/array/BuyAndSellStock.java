package dsasheet.array;

public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        //Let i be the fast pointer and j be the slow pointer
        int i =0;
        int j =i;
        int maxProfit = 0;

        //i to iterate till the end of the array
        while ( i<prices.length){
            int profit = 0;
            //If the difference between the prices are negative, bring the slow pointer to the position of the fast pointer.
            if ( prices[i]-prices[j] <= 0){
                j=i;
            }else{
                profit = prices[i]-prices[j];
            }
            //Comapring current iteration profit with max profit
            maxProfit = Math.max(maxProfit,profit);
            i++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
