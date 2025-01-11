package Strings;

public class VerticalScanning {

    public static String scanningVertically(String[] strs) {

        int index = 0;
        while (true) {
            for (String s : strs) {
                if (index >= s.length() || s.charAt(index) != strs[0].charAt(index)) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }

    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Answer : "+scanningVertically(strs));;
    }
}
