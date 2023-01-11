import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String args[]) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String starter = Arrays.stream(strs).findFirst().get();
        List<String> list = new ArrayList<String>(Arrays.asList(strs));
        list.remove(starter);
        String[] newStrs = list.toArray(new String[0]);

        for(int i=0; i < Arrays.stream(strs).findFirst().get().length(); i++) {
            int sum = 0;
            for (int j=0; j < newStrs.length; j++) {
                if (newStrs[j].startsWith(starter)) {
                    sum += 1;
                }
            }
            if (sum == newStrs.length) {
                break;
            } else {
                starter = starter.substring(0, starter.length()-1);
            }
        }

        return starter;
    }
}
