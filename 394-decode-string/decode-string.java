class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0'); 
            } else if (ch == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                currNum = 0;
                currStr = new StringBuilder();
            } else if (ch == ']') {
                int k = numStack.pop();
                StringBuilder prev = strStack.pop();
                for (int i = 0; i < k; i++) {
                    prev.append(currStr);
                }
                currStr = prev;
            } else {
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}
