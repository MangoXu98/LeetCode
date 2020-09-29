import java.util.Stack;

public class LC1047 {
    static String removeDuplicates(String S) {
        Stack stack=new Stack();
        int len = S.length();
        for (int i = 0; i < len; i++) {
            if(stack.isEmpty()){
                stack.push(S.charAt(i));
                continue;
            }
            else {
                char c = (char) stack.pop();
                if (c == S.charAt(i)) {
                    continue;
                } else {
                    stack.push(c);
                    stack.push(S.charAt(i));
                }
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String ops="abbaca";
        String num=removeDuplicates(ops);
        System.out.print(num);
    }
}
