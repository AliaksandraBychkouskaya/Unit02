package by.tr.mod2;

import java.util.Scanner;

public class Number12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = "";
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        System.out.println(str);
    }
}
