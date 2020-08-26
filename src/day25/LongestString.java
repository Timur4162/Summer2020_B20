package day25;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickoladfsdfsdfss", "Amir", "Nurmamet"};

        int maxLength = arr[0].length(); // 4

        for ( String each : arr) { // to find the MAX LENGTH
            // each = represents EVERY SINGLE elements from String[]arr
            if (each.length()>maxLength){
                maxLength = each.length();
            }
        }
//          ========= HOW MANY STRINGS HAS THAT MaxLENGTH ==============
        for (String each: arr) {
            if (each.length() == maxLength) {
                System.out.println(each);
            }


        }









    }
}
