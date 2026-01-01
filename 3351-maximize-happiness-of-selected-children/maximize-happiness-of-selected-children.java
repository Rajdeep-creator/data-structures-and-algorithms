class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);

        long sum = 0;

        int n = happiness.length;

        for (int i = 0; i < k; i++) {

            int tempsum = happiness[n - 1 - i] - i;

            sum += Math.max(tempsum, 0);

        }

        return sum;

    }
}