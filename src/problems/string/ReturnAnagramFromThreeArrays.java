package problems.string;

import java.util.Arrays;

/**
 * Created by Mohamed.Shaaban on 1/31/2018.
 */
public class CheckThreeArrAnagram {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"cdbm", "abcd", "erop", "abc", "poas"};
        String[] arr2 = new String[]{"poas", "bcd", "pore", "cba", "bca"};
        String[] arr3 = new String[]{"bac", "p", "repo"};


        String[] arrAll = new String[arr1.length + arr2.length + arr3.length];

        addToArray(arr1, arrAll, 0, arr1.length);

        addToArray(arr2, arrAll, arr1.length, arr1.length + arr2.length);

        addToArray(arr3, arrAll, arr1.length + arr2.length, arr1.length + arr2.length + arr3.length);
        Arrays.sort(arrAll);

        checkAnagram(arrAll);
    }

    private static void addToArray(String[] src, String[] dest, int start, int end) {
        int m = 0;
        for (int i = start; i < end; i++) {
            dest[i] = src[m++];
        }
    }

    private static void checkAnagram(String[] arr) {
        int n = 0;
        int m = 1;
        while (m < arr.length) {
            if (arr[n].length() != arr[m].length()) {
                n++;
                m++;
                continue;
            }
            if (IsAnagramByProduct(arr[n].toUpperCase()) == IsAnagramByProduct(arr[m].toUpperCase())) {
                System.out.println(arr[n]);
                n += 2;
                m += 2;
            } else {
                n++;
                m++;
            }
        }

    }


    public static int IsAnagramByProduct(String str1) {
        int Str1Length = str1.length();
        int asciiStr1 = 1;
        for (int i = 0; i < Str1Length; i++) {
            asciiStr1 *= str1.charAt(i);
        }
        return asciiStr1;
    }


}
