/**
 * ReverseInteger
 */
public class ReverseInteger {
    public static long reverse(long x) {
        String num = Long.toString(x);
        String temp = "";
        if (num.contains("-")) {
            num = num.replaceAll("-", "");
            temp += "-";
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            temp += num.charAt(i);
        }

        return Long.parseLong(temp);
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
