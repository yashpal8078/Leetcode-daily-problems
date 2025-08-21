import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
           
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // If closing bracket, check stack
            else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) {
                    return false; // no matching opening
                }
                char cp = st.peek();
                if ((cp == '(' && c == ')') ||
                    (cp == '{' && c == '}') ||
                    (cp == '[' && c == ']')) {
                    st.pop(); // valid match
                } else {
                    return false; // mismatch
                }
            }
        }
        return st.isEmpty(); // must be empty for valid string
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        
        // Test cases
        System.out.println(vp.isValid("()"));     
        System.out.println(vp.isValid("()[]{}"));  
        System.out.println(vp.isValid("(]"));      
        System.out.println(vp.isValid("([)]"));   
        System.out.println(vp.isValid("{[]}"));    
    }
}
