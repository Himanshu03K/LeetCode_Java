class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        int[] map = new int[128];
        int counter = 0;
        for(char ch:t.toCharArray()) {
            map[ch]++;
            counter++;
        }
        int minLen = Integer.MAX_VALUE;
        String str = "";
        while(end<s.length()) {
            char ch = s.charAt(end);
            if(map[ch]>0) {
                counter--;
            }
            map[ch]--;
            if(counter == 0) {
                while(start<=end && map[s.charAt(start)] <0) {
                    map[s.charAt(start)]++;
                    start++;
                }
                if(end-start+1<minLen) {
                    minLen = end - start + 1;
                    str = s.substring(start, end+1);
                }
            }
            end++;
        }
        return str;
    }
}