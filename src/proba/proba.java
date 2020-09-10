package proba;
import java.lang.System;
import java.util.Scanner;
public class proba {
    public static void main(String[] args) {
        //String str = "Ratata";
        //System.out.println(str);
        //Scanner std = new Scanner(System.in); //вводим
        //System.out.println("Your string is: "+std.nextLine());

        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        System.out.println("result = "+result);
    }
}
