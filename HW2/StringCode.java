import java.util.HashSet;
import java.util.Scanner;

public class StringCode {
    public static String blowup(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char current = str.charAt(i);
            if (Character.isDigit(current)) {
                int count = Character.getNumericValue(current);
                if (i + 1 < str.length()) {
                    char nextChar = str.charAt(i + 1);
                    for (int j = 0; j <= count; j++) {
                        res.append(nextChar);
                    }
                }
                i += 2;
            } else {
                res.append(current);
                i++;
            }
        }
        return res.toString();
    }

    public static int maxRun(String str) {
        int n = str.length();
        int maxLength = 0, length = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                length++;
            } else {
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }

    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> substr = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            substr.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if (substr.contains(b.substring(i, i + len))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "a3tx2z";
        System.out.println(blowup(a));
        String b = "xxyyyz";
        System.out.println(maxRun(b));
        System.out.println(stringIntersect("abcde", "cdefg", 3));
    }
}
