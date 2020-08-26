package day06_ComparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {
        short s1=100;
        long l1=s1;    //implcit casting; aoutotically done

        long l2=(long)s1; //if we implicit manually
        int I1 = 300;
        double D1 = I1;

        System.out.println();


        double D2 = (double)I1;
        double d1 = 400.999999;


        double m1 = 34.5;
        float f1 = (long)m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int)r1;
        System.out.println(p1);

        long r2=13;   // should be in a range of a byte
        byte t1=(byte)r2;
        System.out.println(t1);
    }


}
