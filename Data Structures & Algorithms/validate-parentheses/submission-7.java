class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2) return false;
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty()) return false;
                char o = stack.pop();
                if(c == ')' && o != '(') return false; 
                else if(c == ']' && o != '[') return false; 
                else if(c == '}' && o != '{') return false; 
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
