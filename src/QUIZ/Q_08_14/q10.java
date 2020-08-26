package QUIZ.Q_08_14;

import java.util.ArrayList;

public class q10 {
    public static void main(String[] args) {



    ArrayList<Integer> nums = new ArrayList<>();

    nums.add(4);
    nums.remove(nums.size()-1);
    nums.add(2);
    nums.add(10);
    nums.add(0,6);
    nums.remove(1);
    nums.add(-7);
    nums.add(2,2);

        System.out.println(nums);


        ArrayList<String> strs = new ArrayList<>();

        strs.add("j");
        strs.add(0, "1");
        strs.add("i");
        strs.add(2,"5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");

        System.out.print(strs);

}
}