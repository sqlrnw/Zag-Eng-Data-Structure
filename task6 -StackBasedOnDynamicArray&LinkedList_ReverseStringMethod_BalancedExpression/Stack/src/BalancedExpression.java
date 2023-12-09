import java.util.Stack;

public class BalancedExpression {

    public static boolean balancedExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char open = expression.charAt(i);
            if (openBracket(open))
                stack.push(open);
            else if (closedBracket(open)) {
                char pop=stack.pop();
                if(!match(open,pop))
                return false;
            }

        }
      return stack.isEmpty();
    }

    private static boolean match(char open, char pop) {
        return pop=='<'&&open=='>'||pop=='('&&open==')' ||pop=='['&&open==']' ||pop=='{'&&open=='}';
    }

    private static boolean closedBracket(char open) {
        return open == ']' || open == '>' || open == '}' || open == ')';
    }

    private static boolean openBracket(char open) {
        return open == '<' || open == '{' || open == '<' || open == '[';
    }
}
