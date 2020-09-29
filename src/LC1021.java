public class LC1021 {
    static String removeOuterParentheses(String S) {
        return S;
    }
    public static void main(String[] args) {
        String ops="(()())(())";
        String num=removeOuterParentheses(ops);
        System.out.print(num);
    }
}
