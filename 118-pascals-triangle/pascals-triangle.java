class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) return ans;

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            int sz = prev.size();
            for (int j = 1; j < sz; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1); 

            ans.add(curr);
            prev = curr;
        }

        return ans;
    }
}
