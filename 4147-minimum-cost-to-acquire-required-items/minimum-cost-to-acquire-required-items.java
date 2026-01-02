class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        long pair = Math.min(need1, need2);
        long paircost = Math.min(costBoth, cost1 + cost2);

        long totalcostA =
            (pair * paircost)
            + (need1 - pair) * cost1
            + (need2 - pair) * cost2;

        
        long totalcostB = Math.max(need1, need2) * paircost;

        return Math.min(totalcostA, totalcostB);
    }
}
