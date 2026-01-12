class Solution {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {

        char[] chArray = s.toCharArray();
        int i = 0, j = chArray.length - 1;

        while (i < j) {

            if (!isVowel(chArray[i])) {
                i++;
            } else if (!isVowel(chArray[j])) {
                j--;
            } else {
                char temp = chArray[i];
                chArray[i] = chArray[j];
                chArray[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chArray);
    }
}
