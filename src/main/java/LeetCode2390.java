import java.util.Stack;

public class LeetCode2390 {

    // overall tc = O(n+m)
    // overall sc = O(m+m) => O(m)
    public String usingStack(String s) {
        Stack<Character> stack = new Stack<>();

        // TC: O(n), where n = string length
        // SC: O(m), where m = non * characters
        for(char c: s.toCharArray()) {
            if(c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        // TC: O(m), where m = non * characters
        // SC: O(m), where m = non * characters
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }

    public String usingStringBuilder(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '*' && !sb.isEmpty()) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // TODO
    public String usingTwoPointers(String s) {
        return s;
    }
}