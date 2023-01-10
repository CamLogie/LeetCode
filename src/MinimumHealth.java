import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MinimumHealth {

    public static void main(String args[]) {
        int[] damage = new int[]{2,5,3,4};
        int armor = 7;
        System.out.println(minimumHealth(damage, armor));
    }

    public static long minimumHealth(int[] damage, int armor) {
        long sum = 1;
        int max = Arrays.stream(damage).max().getAsInt();
        int maxMinusArmor = (max >= armor) ? max - armor : 0;
        int index = findIndex(damage, max);

        for (int i=0; i < damage.length; i++) {
            if(i == index) {
                sum += maxMinusArmor;
            } else {
                sum += (int)Array.get(damage, i);
            }
        }
        return sum;
    }

    public static int findIndex(int arr[], int t)
    {
        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
