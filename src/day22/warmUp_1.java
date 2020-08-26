package day22;

import java.util.Scanner;

/*
 1. Write a program that asks user to enter a string. If string started with uppercase and
 ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */
public class warmUp_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(str.length()-1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z';       // Upper case characters    ASCII
        boolean end = ch2 >= 'a' && ch2 <= 'z';         // Lower case characters    ASCII


        System.out.println(start && end);

/*                      =========== SECOND VARIANT=============
        if(start && end){
        System.out.println("true");
        }else{
        System.out.println("False")
 */



    }
}
