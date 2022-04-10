class Solution {
    public int uniqueLetterString(String password) {

            int sum = 0, curr = 0, n = password.length();

            int[] last = new int[26];
            int[] prev = new int[26];

            Arrays.fill(last,-1);
            Arrays.fill(prev,-1);

            char[] chars = password.toCharArray();
            for(int i=0;i<n;i++) {
                char c = chars[i];
                curr += (i - last[c- 65] - 1) - (last[c- 65] - prev[c- 65]) + 1;
                sum += curr;

                prev[c-65] = last[c-65];
                last[c-65] = i;
            }

            return sum;
     }
}