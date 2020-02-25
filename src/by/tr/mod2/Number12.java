package by.tr.mod2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Number12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = "";
        
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        
        String [] splittedStr = (str.split(""));
        
        for (int i = 0; i < splittedStr.length; i++) {
            if (i == 0) {
                
                String character = splittedStr[i];
                int ascii = (int) character.charAt(0);
                
                if (ascii == 95 || (ascii >= 65 && ascii <= 90) ||(ascii >= 97 && ascii <= 122))
                {
                    continue;
                }
                else {
                    System.out.println("Первый символ не удовлетворяет требованию");
                    break;
                }
            }
            else {
                
                String character = splittedStr[i];
                int ascii = (int) character.charAt(0);
                
                if (ascii == 95 || (ascii >= 65 && ascii <= 90) ||(ascii >= 97 && ascii <= 122) ||(ascii >= 48 && ascii <= 57))
                {
                    if (i == splittedStr.length-1)
                    System.out.println("Строка удовлетворяет условию");
                }
                else {
                    System.out.println("Строка не удовлетворяет условию");
                    break;
                }
            }
        }
    }
}

