public class strRev {
    public static void rev(String s, int idx) {
        if (idx == 0) {
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        rev(s, idx - 1);
    }

    public static void main(String[] args) {
        String str = "harish";
        rev(str, str.length() - 1);
    }
}
