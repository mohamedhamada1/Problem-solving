package string;

import java.util.Arrays;

/**
 * Created by Mohamed.Shaaban on 1/31/2018.
 * <p>
 * <p>
 * Example :
 * Let's have two words in our alphabet and let's make the following assignment.
 * this is in case two string compare
 * a -> 2
 * b -> 3
 * <p>
 * aba -> encode -> 232 -> multiply -> 12
 * baa -> encode -> 322 -> multiply -> 12
 * Anagrams!
 * <p>
 * aab -> encode -> 223 -> multiply -> 12
 * abb -> encode -> 233 -> multiply -> 18
 * Not anagrams!
 */
public class CheckAnagram {


    public static void main(String[] args) {

        String str1 = "abca";
        String str2 = "bcaa";
        System.out.println(IsAnagramByProduct(str1, str2));
        System.out.println(isAnagramBySort(str1, str2));

    }


    /*
    if two string product is equal = anagram
    complexity o(n)
     */
    public static boolean IsAnagramByProduct(String str1, String str2) {
        int Str1Length = str1.length();
        int Str2Length = str2.length();

        if (Str1Length != Str2Length) return false;
        int asciiStr1 = 1;
        int asciiStr2 = 1;
        for (int i = 0; i < Str2Length; i++) {
            asciiStr1 *= str1.charAt(i);
            asciiStr2 *= str2.charAt(i);
        }
        return asciiStr1 == asciiStr2;
    }

    /*
    this is another approach
    complexity depend on which sort will use
    if you are using merge sort it wil be o(n log(n))
     */
    public static boolean isAnagramBySort(String str1, String str2) {
        char[] arrOfChar1 = str1.toCharArray();
        char[] arrOfChar2 = str2.toCharArray();
        Arrays.sort(arrOfChar1);
        Arrays.sort(arrOfChar2);

        str1 = new String(arrOfChar1);
        str2 = new String(arrOfChar2);
        return str1.contentEquals(str2);
    }
}
