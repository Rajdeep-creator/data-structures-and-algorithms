class Solution {
    public long minCost(String s, int[] cost) {

        int n = s.length();

        long mincc = Long.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {

            long Cost = 0;

            for (int i = 0; i < n; i++) {

                char ch = s.charAt(i);

                if (c != ch) {

                    Cost += cost[i];

                }


            }
                mincc = Math.min(mincc, Cost);

        }
        return mincc;

    }
}