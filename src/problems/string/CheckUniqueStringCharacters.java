package problems.string;

/**
 * Created by Mohamed.Shaaban on 1/31/2018.
 */
public class CheckCharacterDublicate {
    public static void main(String[] args) {

        String str1 = "abca";
        System.out.println(isUniqueChars2(str1));

    }


    /*
    complexity o(n)

     */
    public static boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }


}
