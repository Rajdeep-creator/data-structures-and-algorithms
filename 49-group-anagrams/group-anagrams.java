class Solution {

    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray()) {
            if (!freq.containsKey(c)) return false;
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) freq.remove(c);
        }

        return freq.isEmpty();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        int[] vis = new int[strs.length];
        Arrays.fill(vis, -1);

        for (int i = 0; i < strs.length; i++) {

            if (vis[i] == 1) continue;

            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            vis[i] = 1;

            for (int j = i + 1; j < strs.length; j++) {
                if (vis[j] == -1 && checkAnagram(strs[i], strs[j])) {
                    curr.add(strs[j]);
                    vis[j] = 1;
                }
            }

            ans.add(curr);
        }

        return ans;
    }
}
