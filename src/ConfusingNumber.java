import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConfusingNumber {
    public static void main(String args[]) {
        System.out.println(confusingNumber(28908));
//        System.out.println(confusingNumber(123));
//        System.out.println(confusingNumber(201));
//        System.out.println(confusingNumber(3));
//        System.out.println(confusingNumber(456));
//        System.out.println(confusingNumber(501));
//        System.out.println(confusingNumber(6));
//        System.out.println(confusingNumber(7));
//        System.out.println(confusingNumber(8888));
//        System.out.println(confusingNumber(99898));


    }

    public static boolean confusingNumber(int n) {

        String nCNString = "23457";
        String inputString = Integer.toString(n);
        String reverseInputString = "";

        if (nCNString.contains(inputString.substring(0, 1))) {
            return false;
        }

        for(int i=inputString.length() - 1; i >= 0 ; i--) {
            if(Integer.parseInt(Character.toString(inputString.charAt(i))) == 6) {
                reverseInputString += "9";
            } else if (Integer.parseInt(Character.toString(inputString.charAt(i))) == 9) {
                reverseInputString += "6";
            } else {
                reverseInputString += Character.toString(inputString.charAt(i));
            }
        }

        if (Integer.parseInt(reverseInputString) == n) {
            return false;
        }

        for(int i=0; i < reverseInputString.length() - 1; i++) {
            if (nCNString.contains(reverseInputString.substring(i, i + 1))){
                return false;
            }
        }
        return true;
    }

}
