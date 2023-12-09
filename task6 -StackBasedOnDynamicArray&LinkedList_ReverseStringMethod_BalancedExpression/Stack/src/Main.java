import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String m ="mohamedragap";
        String S =reverseString(m);
        System.out.println(S);

        System.out.println(BalancedExpression.balancedExpression("<><>{}abc"));


    }
    public static String reverseString(String s){
        Stack<Character> stack=new Stack<>();
          String reverse="";
          for(int i=0;i<s.length();i++)
              stack.push(s.charAt(i));
          while (!stack.isEmpty()){
              reverse +=stack.pop();
          }
          return reverse;
    }

}