package OOPBasic.StackDS;

public class CheckBalancedParentheses {

    public boolean isBalanced(String str) {
        Stack stack = new Stack();
        for(char ch: str.toCharArray()) {
            if(ch == '(') {
                stack.push('(');
            }
            else {
                if(stack.size() > 0) {
                    if(stack.pop() != '(') {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
    public static void main(String[] args) {
        System.out.println("Checking Balanced Parentheses");
        String[] brackets = {
            "()()()",
            "((()))",
            "())(()",
            ")()("
        };

        CheckBalancedParentheses ck = new CheckBalancedParentheses();

        for(String str: brackets) {
            if(ck.isBalanced(str)) {
                System.out.println(str + " is Balanced...");
            }
            else {
                System.out.println(str + " is not Balanced...");
            }
        }
    }
}
