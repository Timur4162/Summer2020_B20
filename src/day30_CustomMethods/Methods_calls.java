package day30_CustomMethods;

import Library.Util;

public class Methods_calls {
    public static void main(String[] args) {
        String str = "aaaaaabbbbbbbcccccccc";
        String str2 = Util.removeDup(str);
        System.out.println(str2);

        String str3 = Util.reverse(str2);
        System.out.println(str3);


    }
}
