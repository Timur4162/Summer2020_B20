package QUIZ;

public class quiz2 {
    public static void main(String[] args) {


        String q = "Java is fun";
        int c = q.charAt(4);

        if(c=='a'){
            System.out.println("A");
        }else if (c == ' '){
            System.out.println("B");
        }else {
            System.out.println("C");
        }


        String result = 3425 > (9*1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);

        String str = "the fox ran under the bridge";
        str=str.substring(4,17);
        str.toUpperCase();
        System.out.println(str+"ground");


        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }


        String z = "popcorn";
        z = z.substring(1,8);
        if (z.equals("opcor")){
            System.out.println(z.length());
        }else {
            System.out.println(z.replace("o,", "a"));
        }
    }
}
