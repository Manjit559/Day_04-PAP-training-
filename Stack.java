import java.util.*;

public class Main {
    private static boolean check(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (st.isEmpty()) {
                return false;
            } else {
                char top = st.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{}[]{}";
        if (check(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
