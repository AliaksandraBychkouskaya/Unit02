package by.tr.mod2;

public class Number11 {
    public static void main (String [] args){
        double a,b;
        a = 1;
        b = 4301;
        System.out.println("Цифры, входящие в состав первого числа:");
        do {
            System.out.println(a%10);
            a = (a -a % 10) / 10;
        }
        while (a/10 != 0);
        System.out.println("Цифры, входящие в состав второго числа:");
        do {
            System.out.println( b % 10);
            b = (b -b % 10) / 10;
           // System.out.println(b/10);
        }
        while (b/10 != 0);


    }



}
