package QUIZ;

public class quqia7 {
    public static void main(String[] args) {
        String[]strs = {"display","population","meeting","copy","franchise"};

        int a1 = strs.length;
        int b1 = strs[5].length();

        System.out.print(a1 + " "+ b1);


        //---------------

        byte[]b= new byte[5];
        for (int j =0;j<b.length;j++){
            b[j] = (byte)(b[j]*2);
        }
        System.out.print(b);
    }
}
