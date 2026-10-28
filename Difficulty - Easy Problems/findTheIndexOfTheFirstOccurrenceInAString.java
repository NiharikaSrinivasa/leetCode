
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = solution.strStr(haystack, needle);

        if (result != -1) {
            System.out.println("index: " + result);
        } else {
            System.out.println("not found: " + result);
        }
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
