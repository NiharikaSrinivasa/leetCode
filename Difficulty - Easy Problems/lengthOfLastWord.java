
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String statement = "Niharika Srinivas is a FullstackDeveloper";
        int result = solution.lengthOfLastWord(statement);

        if (result != 0) {
            System.out.println("Its length is " + result);
        } else {
            System.out.println("No data statement, error");
        }
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String sentence = s.trim();
        String[] words = sentence.split("\\s+");

        String lastWord = words[words.length - 1];
        System.out.println(lastWord + " is the last word");

        return lastWord.length();
    }
}
