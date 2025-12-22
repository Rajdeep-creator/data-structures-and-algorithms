class Solution {
    public String multiply(String num1, String num2) {



if(num1.equals("0")||num2.equals("0")){
    return "0";
}
        int l1 = num1.length();
        int l2 = num2.length();

        int res[] = new int[l1 + l2];

        for (int i = l1 - 1; i >= 0; i--) {

            int digit1 = num1.charAt(i) - '0';

            for (int j = l2 - 1; j >= 0; j--) {

                int p1 = i + j;

                int p2 = i + j + 1;

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int val = mul + res[p2];

                int add = val % 10;

                int carry = val / 10;

                res[p2] = add;
                res[p1] += carry;

            }

        }

        String s = "";
        for (int i : res) {

            if (s.length() == 0 && i == 0)
                continue;
            s += (char) (i + '0');

        }
        return s;

    }
}