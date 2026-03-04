public class strOccur {
    public static int first = -1;
    public static int last = -1;

    public static void occur(String s, int idx, char element) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cur = s.charAt(idx);
        if (cur == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        occur(s, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "ajeuahlfauilwawiuahhhhwiahh";
        occur(str, 0, 'a');
    }
}
