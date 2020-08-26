package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {


        Integer num = 100; //   not a primitive, its CLASS
        int a = 100;

        byte t = 100;
        int z = t;

        // Integer z2 = t

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
        // Integer n2 = b2;

        Integer n3 = new Integer(123);

        int[] arr = new int [3];  // gives 000 cos not assigned to a value and default is 0
        double[] arr1 = new double[3];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        // Wrapper class' default value is 0 (null)


        // Wrapper class -  Byte   Short    Integer     Long    Character   Boolean Double  Float
        // Primitives    -   byte   short    int        long    char        boolean double  float


        int p1 = 300;
        Integer p2 = p1;    // AUTOBOXING - converting the primitive values to WRAPPER class
                            //  implicitly done

        Integer q1 = 500;
        int q2 = q1;        // UNBOXING - converting the WRAPPER class values to a primitive values


        Double r1 = 300.0; // don't accept another primitives (as int) like a double can do
       // double r2 = 300;  // 300 the value of int

        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1;   // autoboxing


        Float f1 = 100.5f;
        Float f2 = f1;





    }
}
