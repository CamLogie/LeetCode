import java.util.HashMap;

public class RomanToInteger {
    public static void main(String args[]) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("I"));
    }

    static int romanToInt(String s) {
        HashMap<String, Integer> romans = romans();
        int sum = 0;
        if (s.length() > 1) {
            for (int i=0; i < s.length(); i++) {
                try {
                    String x = String.valueOf(s.charAt(i));
                    String y = String.valueOf(s.charAt(i + 1));
                    if (romans.get(x) < romans.get(y)) {
                        sum += romans.get(y) - romans.get(x);
                        i += 1;
                    } else {
                        sum += romans.get(x);
                    }
                } catch (StringIndexOutOfBoundsException e){
                    String x = String.valueOf(s.charAt(s.length() - 1));
                    String y = String.valueOf(s.charAt(s.length() - 2));
                    if (romans.get(x) > romans.get(y)) {
                    } else {
                        sum += romans.get(x);
                    }
                }
            }
        } else {
            sum += romans.get(s);
        }

        return sum;
    }

    private static HashMap<String, Integer> romans() {
        HashMap<String, Integer> romans = new HashMap<String, Integer>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);
        return romans;
    }

}
