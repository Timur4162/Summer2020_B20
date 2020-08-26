package QUIZ;

public class qiuz4 {
    public static void main(String[] args) {


        String input = "today it will be 100 degrees  !";
        int n = 0;

        while (n++ < input.length()) {
            if (n == 8) {
                continue;
            } else if (n == 9) {
                break;
            }
            System.out.print(input.charAt(++n));

        }

        System.out.println();

        String str2= "cybertek";
        for (int i=0; i <= str2.length();i+=2){
            System.out.print(str2.charAt(i));
        }
    }
}
