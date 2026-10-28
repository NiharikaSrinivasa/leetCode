class Main {
    public static void main(String[] args) {
    Solution solution = new Solution();
        String strs = "()[]{}";
boolean result = solution.isValid(strs);
        if (result){
    System.out.println("Is Valid Parentheses");
        }
        else{
            System.out.println("Is Not Valid Parentheses");
        }
    }

}
class Solution {
public boolean isValid(String s){
    java.util.Stack<Character> stack = new java.util.Stack<>();
    for (char ch : s.toCharArray()){
        if(ch =='(' || ch=='{' || ch=='['){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.pop();
            if(ch==')' && top!= '(' ||
              ch=='}' && top!= '{' ||
              ch==']' && top!= '['
              ){
                return false;
              }
        }
    }
    return stack.isEmpty();
}}
