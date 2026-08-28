class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(isOperator(tokens[i]) && st.size() >= 2) {
                int num1 = st.pop();
                int num2 = st.pop();
                String op = tokens[i];
                int val = doCalculate(op, num2, num1);
                st.push(val);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int doCalculate(String op, int num1, int num2) {
        return switch(op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operator: " + op);
        };
    }
}
