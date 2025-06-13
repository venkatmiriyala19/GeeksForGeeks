class Solution {
    public static int priority(Character a) {
        if (a == '+' || a == '-') return 1;
        if (a == '*' || a == '/') return 2;
        if (a == '^') return 3;
        return 0;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || 
                (c >= 'a' && c <= 'z') || 
                (c >= '0' && c <= '9')) {
                ans.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop(); // Remove '('
            } else { // Operator
                while (!st.isEmpty() && st.peek() != '(' && priority(c) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        
        while (!st.isEmpty()) {
            if (st.peek() != '(') {
                ans.append(st.pop());
            } else {
                st.pop(); // Discard any remaining '('
            }
        }
        
        return ans.toString();
    }
}